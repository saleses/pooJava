public class Main {
    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Rocky");
//        theMovie.watchMovie();

//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter type (A for Adventure, C for Comedy, " +
//                    "S for Science Fiction, or Q to quit): ");
//            String type = s.nextLine();
//            if ("Qq".contains(type)) {
//                break;
//            }
//            System.out.print("Enter Movie Title: ");
//            String title = s.nextLine();
//            Movie movie = Movie.getMovie(type, title);
//            movie.watchMovie();
//        }

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy)  unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
