package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        // Q. [영화] 3편을 저장 할 [배열을 생성]하고 영화 3편의 데이터를 저장하고 출력하세요
        Movie[] mv = new Movie[3];
        mv[0]=new Movie();
        mv[0].title="킹더랜드";
        mv[0].day= 120202;
        mv[0].major="홍길남";
        mv[0].part="일무기";
        mv[0].time=30;
        mv[0].level=12;

        mv[1]=new Movie();
        mv[1].title="오지랍";
        mv[1].day= 120201;
        mv[1].major="홍길동";
        mv[1].part="이무기";
        mv[1].time=130;
        mv[1].level=12;

        mv[2]=new Movie();
        mv[2].title="드라군";
        mv[2].day= 240207;
        mv[2].major="홍길서";
        mv[2].part="삼무기";
        mv[2].time=130;
        mv[2].level=12;

        for (int i=0; i<mv.length; i++){
            System.out.println(mv[i].title+"\t"+mv[i].day+"\t"+mv[i].major+"\t"+mv[i].part+"\t"+mv[i].time+"\t"+mv[i].level);
        }

//        System.out.println(mv[1].title+"\t"+mv[1].releaseDate+"\t"+mv[1].genre+"\t"+mv[1].runningTime+"\t"+mv[1].rating+"\t"+mv[1].hero);
//        System.out.println(mv[2].title+"\t"+mv[2].releaseDate+"\t"+mv[2].genre+"\t"+mv[2].runningTime+"\t"+mv[2].rating+"\t"+mv[2].hero);
    }
}
