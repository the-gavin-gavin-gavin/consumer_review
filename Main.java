
class Main {
  public static void main(String[] args) {
   //System.out.println(Review.fakeReview("simpleReviewMOD.txt", true));
   System.out.println("Sentiment value of vague: "+ Review.sentimentVal("vague"));
   System.out.println("Total sentiment value of "+ Review.totalSentiment("26WestReview.txt"));
   System.out.println("Star rating: "+ Review.starRating("26WestReview.txt"));
   System.out.println("Fake positive review: "+Review.fakeReview("simpleReviewMOD.txt",true));
   System.out.println("Fake negative review: "+Review.fakeReview("simpleReviewMOD.txt",false));
 }
}