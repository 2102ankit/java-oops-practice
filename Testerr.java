package exp5;

import java.util.*;

class Production{
    private String title;
    private String director;
    private String writer;

    public Production(String title,String director,String writer){
        this.setTitle(title);
        this.setDirector(director);
        this.setWriter(writer);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public String getDirector(){
        return this.director;
    }

    public void setWriter(String writer){
        this.writer = writer;
    }

    public String getWriter(){
        return this.writer;
    }

    @Override
    public String toString() {
        return "Title: "+this.getTitle()+"\nDirector: "+this.getDirector()+"\nWriter: "+this.getWriter() ;
    }

}

class Play extends Production{
    private static int performances=0;

    public Play(String title,String director,String writer){
        super(title, director, writer);
        setPerformances();

    }

    public static void setPerformances(){
        performances += 1 ;
    }

    public int getPerformances(){
        return performances;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class Musical extends Play{
    private String composer;
    private String lyricist;

    public Musical(String title,String director,String writer,String composer,String lyricist){
        super(title, director, writer);
        this.setComposer(composer);
        this.setLyricist(lyricist);
    }


    public void setComposer(String composer){
        this.composer = composer;
    }

    public String getComposer(){
        return this.composer;
    }

    public void setLyricist(String lyricist){
        this.lyricist = lyricist;
    }

    public String getLyricist(){
        return this.lyricist;
    }

    @Override
    public String toString() {
        return super.toString() +"\nComposer: "+this.getComposer()+"\nLyricist: "+this.getLyricist();
    }

}

public class Testerr{
    static int collection=0;
    static int perform=0;
    public static void main(String [] args){
        System.out.println("Enter the total number of Plays and Musical: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        Production[] p = new Production[num];

        input(p,num);
        output(p,num);

        //System.out.println("------------------------------------------------");


        System.out.println("\nTOTAL PERFORMANCES = "+ perform );

        System.out.println("\nTOTAL BOX OFFICE COLLECTION: "+ collection);

    }


    public static void input(Production[] p, int num){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i< num; i++){
            System.out.println("\nMusical or Play?(1/2): ");
            int morp = scanner.nextInt();
            scanner.nextLine();

            if(morp==1){
                collection += 800;
                perform+=1;
                System.out.println("Enter Title: ");
                String temptitle = scanner.nextLine();

                System.out.println("Enter Director: ");
                String tempdirector = scanner.nextLine();

                System.out.println("Enter Writer: ");
                String tempwriter = scanner.nextLine();

                System.out.println("Enter Composer: ");
                String tempcomposer = scanner.nextLine();

                System.out.println("Enter Lyricist: ");
                String templyricist = scanner.nextLine();


                p[i] = new Musical(temptitle,tempdirector,tempwriter,tempcomposer,templyricist);
            }

            else if(morp==2){
                collection += 500;
                perform+=1;
                System.out.println("Enter Title: ");
                String temptitle = scanner.nextLine();

                System.out.println("Enter Director: ");
                String tempdirector = scanner.nextLine();

                System.out.println("Enter Writer: ");
                String tempwriter = scanner.nextLine();


                p[i] = new Play(temptitle,tempdirector,tempwriter);

            }
        }


    }

    private static void output(Production[] p, int num) {
        for(int i=0; i<num; i++){
            System.out.println("------------------------------------------------");
            System.out.println(p[i].toString() );
        }
    }

}
