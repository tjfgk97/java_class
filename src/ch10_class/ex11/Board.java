package ch10_class.ex11;

public class Board {

    /**
     * 필드 v
     * 글번호(id) - Long 타입 v
     * 제목(boardTitle) v
     * 작성자(boardWriter) v
     * 내용(boardContents) v
     * 조회수(boardHits) v
     * 필드에 대한 getter/setter v
     * 생성자 2가지
     * toString method
     * 글조회 method
     * name: findById
     * parameter: id
     * return: x
     * 실행내용
     * main으로부터 글번호를 전달받고 글번호가 일치하면 해당 게시글의 내용을
     * print로 출력해준다.
     * 단 출력하기 전에 조회수 값을 1 증가 시켜야 한다.
     */

    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private int boardHits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

    public Board() {
        System.out.println("기본 생성자");
    }

    public Board(Long id, String boardTitle, String boardWriter, String boardContents) {
        System.out.println("id = " + id + ", boardTitle = " + boardTitle + ", boardWriter = " + boardWriter + ", boardContents = " + boardContents);

    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits=" + boardHits +
                '}';
    }

    public void findById(Long id) {
//        int hits = this.getBoardHits();
        if (id.equals(getId())) {
            boardHits++;
            System.out.println(id + "번 글을 조회합니다.");
            System.out.println(getId());
            System.out.println(getBoardTitle());
            System.out.println(getBoardWriter());
            System.out.println(getBoardContents());
            System.out.println("조회수 : " + boardHits);

        } else {
            System.out.println("글 번호가 일치하지 않습니다.\n다시 입력해주세요.");
        }

    }
}
