/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectphase1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author deepak
 */
class featureSet {
    String name;
    String content;

    public featureSet( String n, String c ) {
        name = n;
        content = c;
    }
    
}
class inputQuery {
    ArrayList<featureSet> features;

    public inputQuery(ArrayList<featureSet> f) {
        features = f;
    }
    
}
public class ProjectPhase1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String query = "2016 Indian banknote demonetisation";
        featureSet fs1 = new featureSet( "Background", "The Indian government had demonetised bank notes on two prior occasions—once in 1946 and then in 1978—and in both cases, the goal was to combat tax evasion by \"black money\" held outside the formal economic system.[22] In 1946, the pre-independence government hoped demonetisation would penalise Indian businesses that were concealing the fortunes amassed supplying the Allies in World War II.[22] In 1978, the Janata Party coalition government demonetised banknotes of 1000, 5000 and 10,000 rupees, again in the hopes of curbing counterfeit money and black money.[23]" +
"\n" +
"In 2012, the Central Board of Direct Taxes had recommended against demonetisation, saying in a report that \"demonetisation may not be a solution for tackling black money or shadow economy, which is largely held in the form of benami properties, bullion and jewellery.\"[24][25] According to data from income tax probes, black money holders kept only 6% or less of their wealth as cash, suggesting that targeting this cash would not be a successful strategy.[26]\n" +
"\n" +
"On 28 October 2016 the total banknotes in circulation in India was ₹17.77 trillion (US$280 billion). In terms of value, the annual report of Reserve Bank of India (RBI) of 31 March 2016 stated that total bank notes in circulation valued to ₹16.42 trillion (US$260 billion) of which nearly 86% (around ₹14.18 trillion (US$220 billion)) were ₹500 and ₹1,000 banknotes. In terms of volume, the report stated that 24% (around 22.03 billion) of the total 9026.6 crore (90.26 billion) banknotes were in circulation.[27]\n" +
"\n" +
"In the past, the Bharatiya Janata Party (BJP) had opposed demonetisation. BJP spokesperson Meenakshi Lekhi had said in 2014 that \"The aam aurats and the aadmis (general population), those who are illiterate and have no access to banking facilities, will be the ones to be hit by such diversionary measures.\"[28][29][30][31]\n" +
"\n" +
"In June, the Government of India had devised the Income Declaration Scheme, that lasted till 30 September 2016, providing an opportunity to citizens holding black money and undeclared assets to avoid litigation and come clean by declaring their assets, paying the tax on them and a penalty of 45% thereafter.[32]");
        featureSet fs2 = new featureSet("Procedure", "The plan to demonetise the rupee 500 and rupee 1000 bank notes began six to ten months prior, and was kept highly confidential with only about ten people aware of it completely. \nThe logistical processes and preparations for printing the new rupee 500 and rupee 2000 bank notes began in early-May. \nThe cabinet was informed about the demonetisation on 8 November 2016 in a meeting called by the Prime Minister of India Narendra Modi which was followed by Modi's public announcement about the demonetisation in a televised address.[33]");
        featureSet fs3 = new featureSet("Televised address of PM", "On 8 November 2016, Prime Minister of India Narendra Modi announced the demonetisation in an unscheduled live televised address to the nation at 20:15 IST.[8][9] In the announcement, Modi declared circulation of all ₹500 and ₹1,000 banknotes of the Mahatma Gandhi Series as invalid effective from the midnight of the same day, and announced the issuance of new ₹500 and ₹2,000 banknotes of the Mahatma Gandhi New Series in exchange for the old notes.\n" +
"\n" +
"After Modi's announcement, the Governor of the Reserve Bank of India, Urjit Patel, and Economic Affairs secretary, Shaktikanta Das explained in a press conference that one purpose of the action was to fight terrorism funded by counterfeit notes. While the supply of notes of all denominations had increased by 40 percent between 2011 and 2016, the ₹500 and ₹1,000 banknotes increased by 76 percent and 109 percent, respectively, owing to forgery. They said that forged cash was used to fund terrorist activities against India and that the demonetisation had a counter-terrorism purpose.[34]\n" +
"\n" +
"Patel also informed that the decision had been made about six months ago, and the printing of new banknotes of denomination ₹500 and ₹2,000 had already started. However, only the top members of the government, security agencies and the central bank were aware of the move. But media had reported in October 2016 about the introduction of ₹2,000 denomination well before the official announcement by RBI. This statement has led to much debate, because the Reserve Bank governor six months before the announcement was Raghuram Rajan, while the new banknotes have the signature of the newly appointed governor, Urjit Patel.[35][36]");
        featureSet fs4 = new featureSet("Government ordinance", "The Specified Bank Notes (Cessation of Liabilities) Ordinance,[37] 2016 was issued by the Government of India on 28 December 2016 ceasing the liability of the government for the banned bank notes, and also imposing a fine up to ₹10,000 or five times the amount of the face value of the bank notes, whichever is higher, for people transacting with them after 8 November 2016; or holding more than ten of them after 30 December 2016. The ordinance also provided for the exchange of the bank notes after December 30 for non-resident citizens and others on a case by case basis.[38][39]\n" +
"\n" +
"However, Petrol, CNG and gas stations, government hospitals, railway and airline booking counters, state-government recognised dairies and ration stores, and crematoriums were allowed to accept the banned ₹500 and ₹1,000 bank notes until December 2, 2016.[40]");
        featureSet fs5 = new featureSet("Exchange of old notes", "The Reserve Bank of India stipulated a window of fifty days until 30 December 2016 to deposit the demonetised banknotes as credit in bank accounts. The banknotes could also be exchanged over the counter of bank branches up to a limit that varied over the days:[2]\n" +
"\n" +
"Initially, the limit was fixed at ₹4,000 per person from 8 to 13 November.\n" +
"This limit was increased to ₹4,500 per person from 14 to 17 November.[41][42]\n" +
"The limit was reduced to ₹2,000 per person from 18 November.[43]\n" +
"All exchange of banknotes was abruptly stopped from 25 November 2016.[44]\n" +
"\n" +
"International airports were also instructed to facilitate an exchange of notes amounting to a total value of ₹5,000 for foreign tourists and out-bound passengers.[45]");
        featureSet fs6 = new featureSet("Allegations and claims", "The Communist Party of India (Marxist) (CPM) alleged that the BJP unit in West Bengal had advance knowledge about the impending announcement, and deposited money just before the announcement.[68][69] Aam Aadmi Party leader Arvind Kejriwal also claimed that there had been some leakage regarding the move.[70][71] Kejriwal questioned how Sanjeev Kamboj, a BJP leader in Punjab, posted about the ₹2000 notes days before the official announcement, and alleged that a sudden spike in bank deposits between July and September 2016 was also due to information leakage.[72] The Congress party demanded a probe into this huge jump in bank deposits before the demonetisation.[73] Kamboj rubbished Kejriwal's allegations by saying that he only tweeted that a new ₹2000 note would be issued but nowhere did he mention that old notes would be banned and that there were already some news reports about the introduction of new ₹2000 note. He said Kejriwal is doing dirty politics.[74]\n" +
"\n" +
"Nitish Kumar,[75][76] Arvind Kejriwal[77] and Rahul Gandhi[78] alleged that the BJP made large purchases of land in Bihar ahead of the demonetisation because they had prior information. Rejecting all the allegations, Bihar BJP said that all these purchases have been in public domain and that full records of the transactions are available. It also said that payments were made through drafts and RTGS. The BJP claimed that there were thousands of registries in Bihar in the last few months, some of which could have been made in the names of politicians from other parties and asked whether it meant that all of them had prior knowledge of demonetisation.[79]\n" +
"\n" +
"More than 30 politicians belonging to the BJP were arrested and investigated for having unaccounted money in the new 2000 rupee denomination.[80]");
        featureSet fs7 = new featureSet("Black money", "A Central Bank's report released in August 2017 stated that 99% of the ₹ 500 and ₹ 1000 notes that were demonetised returned to the banking system.[85][86][87] Therefore, the government failed in its aim of purging black money from the economy. India's Prime Minister Modi, had said that due to demonetisation, corrupt officials, businessmen and criminals — popularly believed to hoard large amounts of illicit cash — would be stuck with “worthless pieces of paper”.[20] The amount of money deposited in the banks was much more than the government had expected at the time of banning the notes.[88]Prominent economic analyst Vivek Kaul, said in a BBC article that \"demonetisation had been a failure of epic proportions.\"[21] It was highlighted that there were meagre or no gains as against ill effects such as the cost of printing new notes, loss of livelihoods and deaths.[89]");
        featureSet fs8 = new featureSet("Support", "The decision met with mixed initial reactions. Several bankers like Arundhati Bhattacharya (Chairperson of State Bank of India) and Chanda Kochhar (MD & CEO of ICICI Bank) appreciated the move in the sense that it would help curb black money.[90] Businessmen Anand Mahindra (Mahindra Group), Sajjan Jindal (JSW Group), Kunal Bahl (Snapdeal and FreeCharge) also supported the move adding that it would also accelerate e-commerce.[90] Infosys founder N. R. Narayana Murthy praised the move.[91][92]\n" +
"\n" +
"Finance Minister Arun Jaitley said that demonetisation would clean the complete economic system, increase the size of economy and revenue base. He mentioned the demonetisation along with the upcoming Goods and Services Tax (GST) as \"an attempt to change the spending habit and lifestyle.\"[93]\n" +
"\n" +
"The Indian National Congress spokesperson Randeep Surjewala welcomed the move but remained sceptical on the consequences that would follow.[94] Chief Minister of Bihar Nitish Kumar supported the move.[95][96][97] The demonetisation also got support from Chief Minister of Andhra Pradesh Nara Chandrababu Naidu.[98][99][100] Former Chief Election Commissioner of India S. Y. Quraishi said demonetisation could lead to long term electoral reforms.[101] Indian social activist Anna Hazare hailed demonetisation as a revolutionary step.[102][103][104] The former President of India Pranab Mukherjee welcomed the demonetisation move by calling it bold step.[105][106][107][108] The opinion of the masses varied both ways on micro-blogs and social media sites like Twitter.[109]\n" +
"\n" +
"By and large, international response was positive which saw the move as a bold crackdown on corruption.[110][111][112] International Monetary Fund (IMF) issued a statement supporting Modi's efforts to fight corruption by the demonetisation policy.[110]\n" +
"\n" +
"Chinese state media Global Times praised the move and termed it as \"fierce fight against black money and corruption.\"[111] Former Prime Minister of Finland and Vice-President of European Commission Jyrki Katainen welcomed the demonetisation move stressing that bringing transparency will strengthen Indian economy.[113][114] BBC's South Asia Correspondent Justin Rowlatt in his article praised the move for its secrecy and success and elaborated on reason behind demonetisation.[115] Tim Worstall termed the demonetisation as welcome macroeconomic effect in his article in Forbes magazine.[116] Swedish Minister of Enterprise Mikael Damberg supported the move by calling it bold decision.[112]\n" +
"\n" +
"Singapore-based paper The Independent published a laudatory article on the move titled \"Modi does a Lee Kuan Yew to stamp out corruption in India.\" Lee Kuan Yew was the Singaporean Prime Minister and is considered the architect of modern Singapore. \"From making up his mind to rolling it out, a new Lee Kuan Yew is born in India. It will be reflected in the legacy of this Prime Minister,\" the article said.[117]\n" +
"\n" +
"Indian-American economist Jagdish Bhagwati praised the demonetisation.[118]");
        featureSet fs9 = new featureSet("Criticism", "The Indian Supreme Court while hearing one among a slew of cases filed against the sudden demonetisation decision in various courts,[119] observed that it \"appears to be carpet bombing and not surgical strike\" which government repeatedly claims it to be.[120]\n" +
"\n" +
"Nobel laureate Indian economist Amartya Sen, severely criticised the demonetisation move calling it a \"despotic action\" among other things.[121][122][123]\n" +
"\n" +
"Former Senior Vice-President and Chief Economist of the World Bank, Kaushik Basu, called it a 'major mistake' and said that the 'damage' is likely to be much greater than any possible benefits.[124][125][126]\n" +
"\n" +
"Pronab Sen, former Chief Statistician and Planning Commission of India member, called it a \"hollow move\" since it did not really address any of the purported goals of tackling black money or fake currency.[127]\n" +
"\n" +
"Prabhat Patnaik, a former professor of economics at the Jawaharlal Nehru University, Delhi called the move 'witless' and 'anti-people'. He criticised the simple way in which black money was assumed as \"a hoard of cash\", saying that it would have little effect in eliminating \"black activities\" while \"causing much hardship to common people.\"[128]\n" +
"\n" +
"Noted economist and journalist, T. N. Ninan wrote in the Business Standard that demonetisation 'looks like a bad idea, badly executed on the basis of some half-baked notions'.[129] Deepak Parekh (Chairman of HDFC) had initially appreciated the decision to ban the ₹ 500 and ₹ 1000 notes, but later said that the move had derailed the economy, and expressed skepticism about its outcome.[130][131] Industrialist Rajiv Bajaj criticised the demonetisation, saying that not just the execution, but the concept of demonetisation was wrong in itself.[132]\n" +
"\n" +
"Chief Ministers of several Indian states like Mamata Banerjee,[133] Arvind Kejriwal[134] and Pinarayi Vijayan[135] have criticised and led major protests against the decision in their states and in parliament. Initially, the move to demonetise and try to hinder black money was appreciated, but the manner in which it was carried out by causing hardships to common people was criticised.[136] A Public Interest Litigation (PIL) was filed in Madras High Court by M Seeni Ahamed, General Secretary of the Indian National League, to scrap the decision. The High Court dismissed the PIL stating that it could not interfere in monetary policies of the government.[137] Similar PILs were also filed in the Supreme Court of India.[138] Supreme Court of India is yet to decide on the matter. It is listed for hearing on 2 December 2016.\n" +
"\n" +
"Several government ministers had declared before the demonetisation that they were holding large amounts of cash, including Arun Jaitley, who had more than 65 lakh rupees in cash. This led to speculation about whether and when the ministers had deposited the cash they held.[139][140]\n" +
"\n" +
"Steve Forbes described the move as 'Sickening And Immoral'.[141] He stated that \"What India has done is commit a massive theft of people's property without even the pretense of due process--a shocking move for a democratically elected government.\"[141] Nobel laureate Paul Krugman said that it is difficult to see gains from demonetisation, while there may be significant costs to it.[142]\n" +
"\n" +
"The demonetisation also came in for sharp criticism from media outside India,[143][144] with the New York Times saying that the demonetisation was \"atrociously planned\" and that it did not appear to have combatted black money,[145][146] while an article in The Guardian stated that \"Modi has brought havoc to India\".[143] The Harvard Business Review called it \"a case study in poor policy and even poorer execution\"[147] The frequent change in the narrative on objectives of the demonetisation to its visible impact on the poorest of the poor made other critiques calling government's narrative as spins in view of the \"pointless suffering on India's poorest.\"[148]\n" +
"\n" +
"A Parliamentary panel report in April 2017 stated that rural households and honest taxpayers were the worst hit by demonetisation.[149] It said that it was not just the poor that suffered, but the manufacturing sector was impacted too.[150] According to the panel, demonetisation created significant disruption throughout economy, because it was carried out without prior study or research.[151]");
       ArrayList<featureSet> features = new ArrayList<>();
       features.add(fs1);
       features.add(fs2);
       features.add(fs3);
       features.add(fs4);
       features.add(fs5);
       features.add(fs6);
       features.add(fs7);
       features.add(fs8);
       features.add(fs9);
       inputQuery demonitisation = new inputQuery(features);
       String dummy = new String();System.out.println("---------------------------------------------------------------------------------------------------------------------");
            
        System.out.println("The system is up and running");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
            
        System.out.print("Enter Search Query : ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if(query.contains(userInput)){
            inputQuery curr = demonitisation;
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("The query "+ userInput + " matches with demonitisation database for queries " + query  );
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("The features present are :");
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < curr.features.size(); i++) {
                System.out.println("| "+ (i+1) + " | " +curr.features.get(i).name + " |");
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.print("Enter a feature number : ");
            int featureNumber = sc.nextInt();
            if(featureNumber >=1 && featureNumber <= demonitisation.features.size() ) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("The input is " + featureNumber );
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            
            System.out.println("The selected feature set is " + demonitisation.features.get(featureNumber - 1).name);
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("The contents are :");
                System.out.println(demonitisation.features.get(featureNumber - 1).content);
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                
            } else {
                System.out.println("wrong input");
            }
        } else {
            System.out.println("no matches in database");
        }
        
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                  let us see  the database ?");
        
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.print("                                ");
            if(sc.next().equals("y")) {
            showDB();
        }
       
    }
    public static void showDB() throws IOException {
        System.out.println("");
        String query = "2016 Indian banknote demonetisation";
        featureSet fs1 = new featureSet( "Background", "The Indian government had demonetised bank notes on two prior occasions—once in 1946 and then in 1978—and in both cases, the goal was to combat tax evasion by \"black money\" held outside the formal economic system.[22] In 1946, the pre-independence government hoped demonetisation would penalise Indian businesses that were concealing the fortunes amassed supplying the Allies in World War II.[22] In 1978, the Janata Party coalition government demonetised banknotes of 1000, 5000 and 10,000 rupees, again in the hopes of curbing counterfeit money and black money.[23]" +
"" +
"In 2012, the Central Board of Direct Taxes had recommended against demonetisation, saying in a report that \"demonetisation may not be a solution for tackling black money or shadow economy, which is largely held in the form of benami properties, bullion and jewellery.\"[24][25] According to data from income tax probes, black money holders kept only 6% or less of their wealth as cash, suggesting that targeting this cash would not be a successful strategy.[26]" +
"" +
"On 28 October 2016 the total banknotes in circulation in India was ₹17.77 trillion (US$280 billion). In terms of value, the annual report of Reserve Bank of India (RBI) of 31 March 2016 stated that total bank notes in circulation valued to ₹16.42 trillion (US$260 billion) of which nearly 86% (around ₹14.18 trillion (US$220 billion)) were ₹500 and ₹1,000 banknotes. In terms of volume, the report stated that 24% (around 22.03 billion) of the total 9026.6 crore (90.26 billion) banknotes were in circulation.[27]" +
"" +
"In the past, the Bharatiya Janata Party (BJP) had opposed demonetisation. BJP spokesperson Meenakshi Lekhi had said in 2014 that \"The aam aurats and the aadmis (general population), those who are illiterate and have no access to banking facilities, will be the ones to be hit by such diversionary measures.\"[28][29][30][31]" +
"" +
"In June, the Government of India had devised the Income Declaration Scheme, that lasted till 30 September 2016, providing an opportunity to citizens holding black money and undeclared assets to avoid litigation and come clean by declaring their assets, paying the tax on them and a penalty of 45% thereafter.[32]");
        featureSet fs2 = new featureSet("Procedure", "The plan to demonetise the rupee 500 and rupee 1000 bank notes began six to ten months prior, and was kept highly confidential with only about ten people aware of it completely. The logistical processes and preparations for printing the new rupee 500 and rupee 2000 bank notes began in early-May. The cabinet was informed about the demonetisation on 8 November 2016 in a meeting called by the Prime Minister of India Narendra Modi which was followed by Modi's public announcement about the demonetisation in a televised address.[33]");
        featureSet fs3 = new featureSet("Televised address of PM", "On 8 November 2016, Prime Minister of India Narendra Modi announced the demonetisation in an unscheduled live televised address to the nation at 20:15 IST.[8][9] In the announcement, Modi declared circulation of all ₹500 and ₹1,000 banknotes of the Mahatma Gandhi Series as invalid effective from the midnight of the same day, and announced the issuance of new ₹500 and ₹2,000 banknotes of the Mahatma Gandhi New Series in exchange for the old notes." +
"" +
"After Modi's announcement, the Governor of the Reserve Bank of India, Urjit Patel, and Economic Affairs secretary, Shaktikanta Das explained in a press conference that one purpose of the action was to fight terrorism funded by counterfeit notes. While the supply of notes of all denominations had increased by 40 percent between 2011 and 2016, the ₹500 and ₹1,000 banknotes increased by 76 percent and 109 percent, respectively, owing to forgery. They said that forged cash was used to fund terrorist activities against India and that the demonetisation had a counter-terrorism purpose.[34]" +
"" +
"Patel also informed that the decision had been made about six months ago, and the printing of new banknotes of denomination ₹500 and ₹2,000 had already started. However, only the top members of the government, security agencies and the central bank were aware of the move. But media had reported in October 2016 about the introduction of ₹2,000 denomination well before the official announcement by RBI. This statement has led to much debate, because the Reserve Bank governor six months before the announcement was Raghuram Rajan, while the new banknotes have the signature of the newly appointed governor, Urjit Patel.[35][36]");
        featureSet fs4 = new featureSet("Government ordinance", "The Specified Bank Notes (Cessation of Liabilities) Ordinance,[37] 2016 was issued by the Government of India on 28 December 2016 ceasing the liability of the government for the banned bank notes, and also imposing a fine up to ₹10,000 or five times the amount of the face value of the bank notes, whichever is higher, for people transacting with them after 8 November 2016; or holding more than ten of them after 30 December 2016. The ordinance also provided for the exchange of the bank notes after December 30 for non-resident citizens and others on a case by case basis.[38][39]" +
"" +
"However, Petrol, CNG and gas stations, government hospitals, railway and airline booking counters, state-government recognised dairies and ration stores, and crematoriums were allowed to accept the banned ₹500 and ₹1,000 bank notes until December 2, 2016.[40]");
        featureSet fs5 = new featureSet("Exchange of old notes", "The Reserve Bank of India stipulated a window of fifty days until 30 December 2016 to deposit the demonetised banknotes as credit in bank accounts. The banknotes could also be exchanged over the counter of bank branches up to a limit that varied over the days:[2]" +
"" +
"Initially, the limit was fixed at ₹4,000 per person from 8 to 13 November." +
"This limit was increased to ₹4,500 per person from 14 to 17 November.[41][42]" +
"The limit was reduced to ₹2,000 per person from 18 November.[43]" +
"All exchange of banknotes was abruptly stopped from 25 November 2016.[44]" +
"" +
"International airports were also instructed to facilitate an exchange of notes amounting to a total value of ₹5,000 for foreign tourists and out-bound passengers.[45]");
        featureSet fs6 = new featureSet("Allegations and claims", "The Communist Party of India (Marxist) (CPM) alleged that the BJP unit in West Bengal had advance knowledge about the impending announcement, and deposited money just before the announcement.[68][69] Aam Aadmi Party leader Arvind Kejriwal also claimed that there had been some leakage regarding the move.[70][71] Kejriwal questioned how Sanjeev Kamboj, a BJP leader in Punjab, posted about the ₹2000 notes days before the official announcement, and alleged that a sudden spike in bank deposits between July and September 2016 was also due to information leakage.[72] The Congress party demanded a probe into this huge jump in bank deposits before the demonetisation.[73] Kamboj rubbished Kejriwal's allegations by saying that he only tweeted that a new ₹2000 note would be issued but nowhere did he mention that old notes would be banned and that there were already some news reports about the introduction of new ₹2000 note. He said Kejriwal is doing dirty politics.[74]" +
"" +
"Nitish Kumar,[75][76] Arvind Kejriwal[77] and Rahul Gandhi[78] alleged that the BJP made large purchases of land in Bihar ahead of the demonetisation because they had prior information. Rejecting all the allegations, Bihar BJP said that all these purchases have been in public domain and that full records of the transactions are available. It also said that payments were made through drafts and RTGS. The BJP claimed that there were thousands of registries in Bihar in the last few months, some of which could have been made in the names of politicians from other parties and asked whether it meant that all of them had prior knowledge of demonetisation.[79]" +
"" +
"More than 30 politicians belonging to the BJP were arrested and investigated for having unaccounted money in the new 2000 rupee denomination.[80]");
        featureSet fs7 = new featureSet("Black money", "A Central Bank's report released in August 2017 stated that 99% of the ₹ 500 and ₹ 1000 notes that were demonetised returned to the banking system.[85][86][87] Therefore, the government failed in its aim of purging black money from the economy. India's Prime Minister Modi, had said that due to demonetisation, corrupt officials, businessmen and criminals — popularly believed to hoard large amounts of illicit cash — would be stuck with “worthless pieces of paper”.[20] The amount of money deposited in the banks was much more than the government had expected at the time of banning the notes.[88]Prominent economic analyst Vivek Kaul, said in a BBC article that \"demonetisation had been a failure of epic proportions.\"[21] It was highlighted that there were meagre or no gains as against ill effects such as the cost of printing new notes, loss of livelihoods and deaths.[89]");
        featureSet fs8 = new featureSet("Support", "The decision met with mixed initial reactions. Several bankers like Arundhati Bhattacharya (Chairperson of State Bank of India) and Chanda Kochhar (MD & CEO of ICICI Bank) appreciated the move in the sense that it would help curb black money.[90] Businessmen Anand Mahindra (Mahindra Group), Sajjan Jindal (JSW Group), Kunal Bahl (Snapdeal and FreeCharge) also supported the move adding that it would also accelerate e-commerce.[90] Infosys founder N. R. Narayana Murthy praised the move.[91][92]" +
"" +
"Finance Minister Arun Jaitley said that demonetisation would clean the complete economic system, increase the size of economy and revenue base. He mentioned the demonetisation along with the upcoming Goods and Services Tax (GST) as \"an attempt to change the spending habit and lifestyle.\"[93]" +
"" +
"The Indian National Congress spokesperson Randeep Surjewala welcomed the move but remained sceptical on the consequences that would follow.[94] Chief Minister of Bihar Nitish Kumar supported the move.[95][96][97] The demonetisation also got support from Chief Minister of Andhra Pradesh Nara Chandrababu Naidu.[98][99][100] Former Chief Election Commissioner of India S. Y. Quraishi said demonetisation could lead to long term electoral reforms.[101] Indian social activist Anna Hazare hailed demonetisation as a revolutionary step.[102][103][104] The former President of India Pranab Mukherjee welcomed the demonetisation move by calling it bold step.[105][106][107][108] The opinion of the masses varied both ways on micro-blogs and social media sites like Twitter.[109]" +
"" +
"By and large, international response was positive which saw the move as a bold crackdown on corruption.[110][111][112] International Monetary Fund (IMF) issued a statement supporting Modi's efforts to fight corruption by the demonetisation policy.[110]" +
"" +
"Chinese state media Global Times praised the move and termed it as \"fierce fight against black money and corruption.\"[111] Former Prime Minister of Finland and Vice-President of European Commission Jyrki Katainen welcomed the demonetisation move stressing that bringing transparency will strengthen Indian economy.[113][114] BBC's South Asia Correspondent Justin Rowlatt in his article praised the move for its secrecy and success and elaborated on reason behind demonetisation.[115] Tim Worstall termed the demonetisation as welcome macroeconomic effect in his article in Forbes magazine.[116] Swedish Minister of Enterprise Mikael Damberg supported the move by calling it bold decision.[112]" +
"" +
"Singapore-based paper The Independent published a laudatory article on the move titled \"Modi does a Lee Kuan Yew to stamp out corruption in India.\" Lee Kuan Yew was the Singaporean Prime Minister and is considered the architect of modern Singapore. \"From making up his mind to rolling it out, a new Lee Kuan Yew is born in India. It will be reflected in the legacy of this Prime Minister,\" the article said.[117]" +
"" +
"Indian-American economist Jagdish Bhagwati praised the demonetisation.[118]");
        featureSet fs9 = new featureSet("Criticism", "The Indian Supreme Court while hearing one among a slew of cases filed against the sudden demonetisation decision in various courts,[119] observed that it \"appears to be carpet bombing and not surgical strike\" which government repeatedly claims it to be.[120]" +
"" +
"Nobel laureate Indian economist Amartya Sen, severely criticised the demonetisation move calling it a \"despotic action\" among other things.[121][122][123]" +
"" +
"Former Senior Vice-President and Chief Economist of the World Bank, Kaushik Basu, called it a 'major mistake' and said that the 'damage' is likely to be much greater than any possible benefits.[124][125][126]" +
"" +
"Pronab Sen, former Chief Statistician and Planning Commission of India member, called it a \"hollow move\" since it did not really address any of the purported goals of tackling black money or fake currency.[127]" +
"" +
"Prabhat Patnaik, a former professor of economics at the Jawaharlal Nehru University, Delhi called the move 'witless' and 'anti-people'. He criticised the simple way in which black money was assumed as \"a hoard of cash\", saying that it would have little effect in eliminating \"black activities\" while \"causing much hardship to common people.\"[128]" +
"" +
"Noted economist and journalist, T. N. Ninan wrote in the Business Standard that demonetisation 'looks like a bad idea, badly executed on the basis of some half-baked notions'.[129] Deepak Parekh (Chairman of HDFC) had initially appreciated the decision to ban the ₹ 500 and ₹ 1000 notes, but later said that the move had derailed the economy, and expressed skepticism about its outcome.[130][131] Industrialist Rajiv Bajaj criticised the demonetisation, saying that not just the execution, but the concept of demonetisation was wrong in itself.[132]" +
"" +
"Chief Ministers of several Indian states like Mamata Banerjee,[133] Arvind Kejriwal[134] and Pinarayi Vijayan[135] have criticised and led major protests against the decision in their states and in parliament. Initially, the move to demonetise and try to hinder black money was appreciated, but the manner in which it was carried out by causing hardships to common people was criticised.[136] A Public Interest Litigation (PIL) was filed in Madras High Court by M Seeni Ahamed, General Secretary of the Indian National League, to scrap the decision. The High Court dismissed the PIL stating that it could not interfere in monetary policies of the government.[137] Similar PILs were also filed in the Supreme Court of India.[138] Supreme Court of India is yet to decide on the matter. It is listed for hearing on 2 December 2016." +
"" +
"Several government ministers had declared before the demonetisation that they were holding large amounts of cash, including Arun Jaitley, who had more than 65 lakh rupees in cash. This led to speculation about whether and when the ministers had deposited the cash they held.[139][140]" +
"" +
"Steve Forbes described the move as 'Sickening And Immoral'.[141] He stated that \"What India has done is commit a massive theft of people's property without even the pretense of due process--a shocking move for a democratically elected government.\"[141] Nobel laureate Paul Krugman said that it is difficult to see gains from demonetisation, while there may be significant costs to it.[142]" +
"" +
"The demonetisation also came in for sharp criticism from media outside India,[143][144] with the New York Times saying that the demonetisation was \"atrociously planned\" and that it did not appear to have combatted black money,[145][146] while an article in The Guardian stated that \"Modi has brought havoc to India\".[143] The Harvard Business Review called it \"a case study in poor policy and even poorer execution\"[147] The frequent change in the narrative on objectives of the demonetisation to its visible impact on the poorest of the poor made other critiques calling government's narrative as spins in view of the \"pointless suffering on India's poorest.\"[148]" +
"" +
"A Parliamentary panel report in April 2017 stated that rural households and honest taxpayers were the worst hit by demonetisation.[149] It said that it was not just the poor that suffered, but the manufacturing sector was impacted too.[150] According to the panel, demonetisation created significant disruption throughout economy, because it was carried out without prior study or research.[151]");
       ArrayList<featureSet> features = new ArrayList<>();
       features.add(fs1);
       features.add(fs2);
       features.add(fs3);
       features.add(fs4);
       features.add(fs5);
       features.add(fs6);
       features.add(fs7);
       features.add(fs8);
       features.add(fs9);
       inputQuery db = new inputQuery(features);
       
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                The database referred for given query is as follows");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("[{");
        System.out.println("        \""+query+"\":  {");
        System.out.println("        \"$queryID\": \"5968dd23fc13ae04d9000001\"");
        System.out.println("        },");
        System.out.println("            \"feature\": [{");
        for (int i = 0; i < db.features.size(); i++) {
            System.out.println("                        \"name\":  \""+db.features.get(i).name+"\",    ");
            System.out.println("                        \"content\":    \""+db.features.get(i).content+"\"  ");
            System.out.println("                }" + ((i<db.features.size()-1)?",\n                {":"]"));
        }
//        for (int i = 0; i < db.features.size(); i++) {
//            System.out.println("            \"" + db.features.get(i).name + "\":        \""+db.features.get(i).content+"\""); 
//        }
        System.out.println("}]");
    }
}
