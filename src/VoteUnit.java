import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class VoteUnit {
	
	static ArrayList<vClass>_candidates = new ArrayList<vClass>();
	String voter_id;

  	public VoteUnit (String id)
	{
		 voter_id = id;
	};

	 public void addVote(vClass arg) {
	     _candidates.add(arg);
	   }
	
	 public String getVoteID ()
	 {
		 return voter_id;
	 };
	 
	 
	 
	 public static String vote_result()
	 {

		 Enumeration<vClass> candidates = Collections.enumeration(_candidates);
		 String result = "Final Voting Results \n" ;
		
		 while(candidates.hasMoreElements())
		 {
			 vClass each = (vClass) candidates.nextElement();
			  
				 each.getCandidate().votes++;
				 result += "\t" + each.getCandidate().getCand_name() + "\t" + each.getCandidate().getCand_constituency() + "\t" + each.getCandidate().votes +"\n";
			 
			 
		 }
		 
		 
		 return result;
		 
		 
	 }
	  
}



