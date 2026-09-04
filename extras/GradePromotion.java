public class GradePromotion {
    public static void main(String[] args) {
        System.out.println("GradePromotion!");
        System.out.println(schoolAssessment(10.0));
    }

    private static String schoolAssessment(double testScore) {
        String assessment = (testScore < 7.0) ? "You're disapproved!" : "You're approved!";
        return assessment;
    }
}
