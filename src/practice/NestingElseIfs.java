package practice;

public class NestingElseIfs {
	public static void main(String[] args) {
		
	/*if student completed a quiz we will check for a score
	 * if score >90 --> great job
	 * if score >80 --> well done
	 * if score >70 --> you could have done better
	 * 
	 * if student did not complete the quiz --> not good
	 * please do homework on time
	 */
		
		boolean quizCompleted=true;
		int score=70;
		
		if(quizCompleted) {
			System.out.println("Let's check your score");//complete first if and final else and test first
			if (score>90) {
				System.out.println("Great job!, you study a lot");
			}else if (score>70) { //try changing this to 70 first then do 80 next
				System.out.println("Well done");
			}else if (score >80) {
				System.out.println("You could have done better");
			}else {
				System.out.println("You failed");
			}
			
		}else {
			System.out.println("Please do HW on time");
		}
		
	}
	

}
