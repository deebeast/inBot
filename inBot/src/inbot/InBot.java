/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inbot;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.cluster.CompleteLinkClusterer;
import com.aliasi.cluster.Dendrogram;
import com.aliasi.cluster.HierarchicalClusterer;
import com.aliasi.cluster.SingleLinkClusterer;
import com.aliasi.sentences.IndoEuropeanSentenceModel;
import com.aliasi.sentences.SentenceChunker;
import com.aliasi.sentences.SentenceModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import com.aliasi.spell.EditDistance;
import com.aliasi.tokenizer.IndoEuropeanTokenizerFactory;
import com.aliasi.tokenizer.TokenizerFactory;
import com.aliasi.util.Distance;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author deepak
 */
public class InBot {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    static final Distance<CharSequence> EDIT_DISTANCE = new EditDistance(false);
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        Set<String> contentSet = new HashSet<>();
        String path = "query"; 
        String query = "demonetisation_in_india";//scan.nextLine();
        path+="/"+query;
        int numOfFiles =  new File(path).listFiles().length;
        System.out.println(numOfFiles);
        String allContent = "";
//        int nameLength = 0;
        for(int i=1;i<=numOfFiles;i++) {
            File file = new File(path+"/sample"+i+".txt");
            Scanner sc = new Scanner(file);
            Scanner useDelimiter = sc.useDelimiter("\\Z");
            allContent = sc.next();
//            nameLength = allContent.split("\n")[1].length();
            contentSet.add(allContent.split("\n")[0]);
        }
        int sent = 1;
        Set<Set<String>> newClusters = LinkClusteringTfIdf.clusterSummaryTexts(contentSet);
        int cluster = 1;
        for (Set<String> currCluster :  newClusters) {
            sent = 1;
            System.out.println("cluster "+cluster);
            for (String sentences : currCluster) {
                System.out.println("Sentence "+sent +" : " + sentences);
                sent++;
            }
            cluster++;
        }
        
        
        Set<String> allSentences = new HashSet<>();
        sent = 1;
        int clus = 1;
        for (String text:contentSet) {
            ArrayList<String> sentences = new ArrayList<>();
            boolean endSent = true;
            boolean parenS = false;
            SentenceModel sentenceModel = new IndoEuropeanSentenceModel(endSent,parenS);
            System.out.println("Cluster="+(clus++)+" "+text);
            System.out.println();
            TokenizerFactory tokFactory = IndoEuropeanTokenizerFactory.INSTANCE;
            Chunker sentenceChunker = new SentenceChunker(tokFactory,sentenceModel);
            Chunking chunking = sentenceChunker.chunk(text);
            //From Summry of cluster we created saperate sentences. 
            Set<Chunk> chunks = chunking.chunkSet();
            String textStored = chunking.charSequence().toString();
            for (Chunk sentence : chunks) {
                    int start = sentence.start();
                    int end = sentence.end();
                    //System.out.println("SENTENCE :" + textStored.substring(start,end));
                    String inSentence =textStored.substring(start,end);
                    if(inSentence.length()>=5)
                            sentences.add(inSentence);
            }
            allSentences.addAll(sentences);
        }
        
        System.out.println("the size of allSentences : " + allSentences.size());
        
        newClusters = LinkClusteringTfIdf.clusterSummaryTexts(allSentences);
        cluster = 1;
        int maxSizeOfCluster = 0;
        for (Set<String> currCluster :  newClusters) {
            clusterToFile(currCluster,cluster);
            if(maxSizeOfCluster < currCluster.size())
                maxSizeOfCluster = currCluster.size();
            sent = 1;
            System.out.println("cluster "+cluster);
            for (String sentences : currCluster) {
                System.out.println("Sentence "+sent +" : " + sentences);
                sent++;
            }
            cluster++;
        }
        /**
         * save cluster to text file
         * 
         */
        
        for (Set<String> currCluster :  newClusters) {
            
        }
        
        /**
         * prrint all sentences
         */
//        for (String str : allSentences) {
//            System.out.println("Sentence " + sent + " :");
//            System.out.println(str);
//            sent++;
//        }

//        System.out.println("maxClusterSize "+maxSizeOfCluster );
        System.out.println("xxxxxxxxxxxxxx done xxxxxxxxxxxxxxxxx");
        
//        // dump off-diagonal upper triangular distance matrix
//        for (String s1 : contentSet) 
//            for (String s2: contentSet)
//                if (s1.compareTo(s2) < 0)
//                    System.out.println("distance(" + s1 + "," + s2 + ")=" + EDIT_DISTANCE.distance(s1,s2));
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//        // set up max distance
//        double maxDistance = 0.7;//nameLength;
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//        // Single-Link Clusterer
//        HierarchicalClusterer<String> slClusterer = new SingleLinkClusterer<String>(maxDistance,EDIT_DISTANCE);
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//        // Complete-Link Clusterer
//        HierarchicalClusterer<String> clClusterer = new CompleteLinkClusterer<String>(maxDistance,EDIT_DISTANCE);
//        
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//         // Hierarchical Clustering
//        Dendrogram<String> slDendrogram
//            = slClusterer.hierarchicalCluster(contentSet);
//        System.out.println("\nSingle Link Dendrogram");
//        System.out.println(slDendrogram.prettyPrint());
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//        Dendrogram<String> clDendrogram  = clClusterer.hierarchicalCluster(contentSet);
//        System.out.println("\nComplete Link Dendrogram");
//        System.out.println(clDendrogram.prettyPrint());
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//        // Dendrograms to Clusterings
//        System.out.println("\nComplete Link Clusterings");
//        for (int k = 1; k <= clDendrogram.size(); ++k) {
//            Set<Set<String>> clKClustering = clDendrogram.partitionK(k);
//            System.out.println(k + "  " + clKClustering);
//        }
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//        System.out.println("\nSingle Link Clusterings");
//        for (int k = 1; k <= slDendrogram.size(); ++k) {
//            Set<Set<String>> slKClustering = slDendrogram.partitionK(k);
//            System.out.println(k + "  " + slKClustering);
//        }
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//         Set<Set<String>> clClustering
//            = clClusterer.cluster(contentSet);
//        System.out.println("\n\nComplete Link Clustering");
//        System.out.println(clClustering);
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//        
//        
//         Set<Set<String>> slClustering
//            = slClusterer.cluster(contentSet);
//        System.out.println("\nSingle Link Clustering");
//        System.out.println(slClustering);
//        
//        System.out.println("-----------------------------------------------------------------------------------------");
//        
//        for (String s : contentSet) {
//            System.out.println(s);
//        }
//        System.out.println("-----------------------------------------------------------------------------------------");
        
    }

    private static void clusterToFile(Set<String> currCluster, int cluster) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("Cluster/cluster_"+cluster+".txt"))) {
            Iterator it = currCluster.iterator();
            while(it.hasNext()) {
                out.write((String) it.next());
                out.newLine();
            }
        } // why capital "M"?
    }
}