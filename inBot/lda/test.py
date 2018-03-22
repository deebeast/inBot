#lda.LDA implements latent Dirichlet allocation (LDA).
#The interface follows conventions found in scikit-learn.
#The following demonstrates how to inspect a model of a subset of the Reuters news dataset.
#The input below, X, is a document-term matrix (sparse matrices are accepted).

#imports for the script
import numpy as np
import lda
import lda.datasets

X = lda.datasets.load_reuters()
vocab = lda.datasets.load_reuters_vocab()
titles = lda.datasets.load_reuters_titles()
X.shape
X.sum()
model = lda.LDA(n_topics=20, n_iter=1500, random_state=1)
model.fit(X)  # model.fit_transform(X) is also available
topic_word = model.topic_word_  # model.components_ also works
n_top_words = 8
print()
for i, topic_dist in enumerate(topic_word):
    topic_words = np.array(vocab)[np.argsort(topic_dist)][:-(n_top_words+1):-1]
    print('Topic {}: {}'.format(i, ' '.join(topic_words)))

print()
#The document-topic distributions are available in model.doc_topic_.

doc_topic = model.doc_topic_
for i in range(10):
    print("{} (top topic: {})".format(titles[i], doc_topic[i].argmax()))
