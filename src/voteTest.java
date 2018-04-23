import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class voteTest {

	Candidate cand1,cand2;
	VoteUnit v1,v2,v3;

	@BeforeEach
	void setUp() throws Exception {
		
		cand1 = new Candidate ("Jignesh","Mapusa","111",0);
		cand2 = new Candidate ("Gomes","Mapusa","112",0);
		
		v1 = new VoteUnit("lobo");
		v1.addVote(new vClass(cand1));
		
		v2 = new VoteUnit("jayesh");
		v2.addVote(new vClass(cand2));
		
		v3 = new VoteUnit("julie");
		v3.addVote(new vClass(cand2));
		
		System.out.println(VoteUnit.vote_result());

		
	}

	
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	

}
