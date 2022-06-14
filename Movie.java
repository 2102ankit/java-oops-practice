package exp4;

import java.util.*;

public class Movie{
    String title;
    String genre;
    float budget;// in cr
    String heroName;
    String heroineName;



    public static void main(String[] args){
        input();
    }


    private static void sumHeroine(Set<String> hshn, int numOfMovies, Movie[] movies) {
        String[] arr = new String[hshn.size()];

        int x=0;

        // iterating over the hashset
        for(String ele:hshn){
            arr[x++] = ele;
        }

        int sum;

        for(int i =0; i< x; i++){
            sum =0;
            System.out.println(arr[i]);
            for (int j = 0; j < numOfMovies; j++) {
                if(arr[i].equals(movies[j].heroineName))
                    sum+= movies[j].budget;
            }
            System.out.println("Cumulative budget is "+sum);
        }

    }

    private static void sumHero(Set<String> hsh, int numOfMovies, Movie[] movies) {
        //for(int i =0; ; i++)
        String[] arr = new String[hsh.size()];
        int x=0;
        // iterating over the hashset
        for(String ele:hsh){
            arr[x++] = ele;
        }
        int sum;

        for(int i =0; i< x; i++){
            sum  = 0;
            System.out.println(arr[i]);
            for (int j = 0; j < numOfMovies; j++) {
                if(arr[i].equals(movies[j].heroName))
                    sum+= movies[j].budget;
            }
            System.out.println("Cumulative budget is "+sum);
        }
    }// end sumhero method

    private static void sumGenre(Set<String> hsg, int numOfMovies, Movie[] movies) {
        String[] arr = new String[hsg.size()];
        int x=0;
        // iterating over the hashset
        for(String ele:hsg){
            arr[x++] = ele;
        }
        int sum;

        for(int i =0; i< x; i++){
            sum = 0;
            System.out.println(arr[i]);
            for (int j = 0; j < numOfMovies; j++) {
                if(arr[i].equals(movies[j].genre))
                    sum+= movies[j].budget;
            }
            System.out.println("Cumulative budget is "+sum);
        }
    }// end sumgenre method

    public static void input(){
        System.out.println("Enter the number of movies you want to input:");
        Scanner scanner = new Scanner(System.in);
        int numOfMovies = scanner.nextInt();
        scanner.nextLine();

        Movie[] movies = new Movie[numOfMovies];

        Set<String> hsg = new HashSet<String>();
        Set<String> hsh = new HashSet<String>();
        Set<String> hshn = new HashSet<String>();

        for(int i=0;i<numOfMovies; i++){
            movies[i] = new Movie();
            System.out.println("Enter the title of Movie "+(i+1)+":");
            movies[i].title = scanner.nextLine();
            System.out.println("Enter the genre of Movie "+(i+1)+":");
            movies[i].genre = scanner.nextLine();
            hsg.add(movies[i].genre);


            System.out.println("Enter the budget of Movie in Crs"+(i+1)+":");
            movies[i].budget = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the Hero of Movie "+(i+1)+":");
            movies[i].heroName = scanner.nextLine();
            hsh.add(movies[i].heroName);

            System.out.println("Enter the Heroine of Movie "+(i+1)+":");
            movies[i].heroineName = scanner.nextLine();
            hshn.add(movies[i].heroineName);

        }

        System.out.println("\n-------------------------------\nOUTPUT MOVIES");
        output(movies,numOfMovies);

        sort(movies,numOfMovies);
        System.out.println("\n-------------------------------\nOUTPUT MOVIES AFTER SORTING");
        output(movies,numOfMovies);
//        System.out.println("\n-------------------------------\nOUTPUT SET");
//        System.out.println(hsg);

        int x=1;
        while(x!=0) {
            System.out.println("""
                    How do you the budget to be displayed according to?
                    1.Genre
                    2.Hero
                    3.Heroine
                    0.exit.""");
            x = scanner.nextInt();
            switch (x) {
                case 1 -> sumGenre(hsg, numOfMovies, movies);
                case 2 -> sumHero(hsh, numOfMovies, movies);
                case 3 -> sumHeroine(hshn, numOfMovies, movies);
                case 0 -> {
                    System.out.println("Thank You!");
                    x = 0;
                }
            }// end switch
        }// end while
    }//  end input method



    public static void output(Movie[] movies, int numOfMovies){
        for(int i=0;i<numOfMovies; i++){
            System.out.println("\nThe title of Movie "+(i+1)+": "+movies[i].title);
            System.out.println("The genre of Movie "+(i+1)+": "+movies[i].genre);
            System.out.println("The budget of Movie "+(i+1)+": "+movies[i].budget+" Cr Rupees");
            System.out.println("The Hero of Movie "+(i+1)+": "+movies[i].heroName);
            System.out.println("The Heroine of Movie "+(i+1)+": "+movies[i].heroineName);
        }
    }// end output method

    public static void sort(Movie[] movies, int numOfMovies){
        for(int i=0; i<numOfMovies-1; i++){
            int minIndex = i;
            for(int j=i+1; j<numOfMovies; j++){
                if(movies[j].budget < movies[i].budget)
                    minIndex = j;
            }
            Movie temp = movies[minIndex];
            movies[minIndex]  =movies[i];
            movies[i] = temp;
        }
    }// end sort method

}