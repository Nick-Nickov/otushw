class Question {
    private String question;
    private String[] options;
    private int correctAnswer;

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    String getQuestion() {
        return question;
    }

    String[] getOptions() {
        return options;
    }

    int getCorrectAnswer() {
        return correctAnswer;
    }
}
