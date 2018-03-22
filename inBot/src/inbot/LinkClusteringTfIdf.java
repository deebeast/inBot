package inbot;

import com.aliasi.cluster.CompleteLinkClusterer;
import java.util.Set;

import com.aliasi.cluster.HierarchicalClusterer;
import com.aliasi.cluster.SingleLinkClusterer;
import com.aliasi.spell.TfIdfDistance;
import com.aliasi.tokenizer.IndoEuropeanTokenizerFactory;

public class LinkClusteringTfIdf {
	/**
	 * @param inputSet
	 * @return 
	 */
	public static Set<Set<String>> clusterSummaryTexts(Set<String> inputSet) {
		TfIdfDistance TFIDF_DISTANCE = new TfIdfDistance(IndoEuropeanTokenizerFactory.INSTANCE);
		
		System.out.println("Input set size " + inputSet.size());
		for(String text:inputSet){
			TFIDF_DISTANCE.handle(text);
		}
		
	
		// Single/Complete-Link Clusterer
		double maxDistance = 0.9;
        HierarchicalClusterer<String> slClusterer 
            = new CompleteLinkClusterer(maxDistance,TFIDF_DISTANCE);//SingleLinkClusterer(maxDistance,TFIDF_DISTANCE);
        
        // Hierarchical Clustering
       
        
        Set<Set<String>> slClustering
        = slClusterer.cluster(inputSet);
        System.out.println("\n Link Clustering for tables summaries...");
        //System.out.println(slClustering);
        
        
        /**
         * ask abhishek
         */
//        ObjectToCounterMap<Set<String>> clusterCounterMap = new ObjectToCounterMap<>();
//        for(Set<String> ss : slClustering){
//        	clusterCounterMap.set(ss, ss.size());
//        }
//        int clusterCount = 0;
//		for(Set<String> ss : clusterCounterMap.keysOrderedByCountList()){
//			if (ss.size() == 1) continue;
//			System.out.println("Cluster #: " + clusterCount + " summaryCluster: " + ss.size() //+ ":" + ss.toString()
//			);
//			for(String item:ss){
//				System.out.println("<>" + item);
//			}
//			System.out.println("\n\n\n");
//			clusterCount++;
//		}
		return slClustering;
	}

}