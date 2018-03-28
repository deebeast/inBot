#usinf pytrends to collect
from pytrends.request import TrendReq

# Login to Google. Only need to run this once, the rest of requests will use the same session.
pytrends = TrendReq()

# Get Google Hot Trends data
trending_searches_df = pytrends.trending_searches()


#fetch top trends keywords
trends_as_list = list(trending_searches_df['title'])
