package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args){
        //내코드
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for(MovieReview m : movieReviews){
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }

        //강의 코드

        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        reviews[1] = aboutTime;

        for(MovieReview review : reviews){
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
