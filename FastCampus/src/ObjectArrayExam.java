public class ObjectArrayExam {
    public static void main(String[] args) {
        // Q. [영화] 3편을 저장 할 [배열을 생성]하고 영화 3편의 데이터를 저장하고 출력하세요
        Movie[] mv = new Movie[3];
        mv[0]=new Movie();
        mv[0].title="킹더랜드";
        mv[0].releaseDate= "12-02-02";
        mv[0].hero="홍길남";
        mv[0].genre="일무기";
        mv[0].runningTime=30;
        mv[0].rating="b";

        mv[1]=new Movie();
        mv[1].title="오지랍";
        mv[1].releaseDate= "12-02-01";
        mv[1].hero="홍길동";
        mv[1].genre="이무기";
        mv[1].runningTime=130;
        mv[1].rating="a";

        mv[2]=new Movie();
        mv[2].title="드라군";
        mv[2].releaseDate= "24-02-07";
        mv[2].hero="홍길서";
        mv[2].genre="삼무기";
        mv[2].runningTime=130;
        mv[2].rating="a";

        for (int i=0; i<mv.length; i++){
            System.out.println(mv[i].title+"\t"+mv[i].releaseDate+"\t"+mv[i].genre+"\t"+mv[i].runningTime+"\t"+mv[i].rating+"\t"+mv[i].hero);
        }

//        System.out.println(mv[1].title+"\t"+mv[1].releaseDate+"\t"+mv[1].genre+"\t"+mv[1].runningTime+"\t"+mv[1].rating+"\t"+mv[1].hero);
//        System.out.println(mv[2].title+"\t"+mv[2].releaseDate+"\t"+mv[2].genre+"\t"+mv[2].runningTime+"\t"+mv[2].rating+"\t"+mv[2].hero);
    }
}
