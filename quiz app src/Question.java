package rhettmartin.cs3354.txstate.edu.GoTV2;

class Question {
    private int question;
    private boolean trueQuestion;

    public int getQuestion() {
        return question;
    }

    public boolean isTrueQuestion() {
        return trueQuestion;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        this.trueQuestion = trueQuestion;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question=" + question +
                ", trueQuestion=" + trueQuestion +
                '}';
    }

    public Question(int question, boolean trueQuestion) {
        this.question = question;
        this.trueQuestion = trueQuestion;
    }
}
