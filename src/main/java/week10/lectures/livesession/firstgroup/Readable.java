package week10.lectures.livesession.firstgroup;

import week10.lectures.lambdafunctions.interfaces.Printable;

@FunctionalInterface
interface Readable {
    String read(String content, String author);
}

class MainRun {
    // What is a main method?????????????????
    public static void main(String[] args) {
        MainRun m = new MainRun();
        m.printReadables(
                (content, author) -> {
                    String becir = "Becir";
                    return "Interface is reading! " + content + " written by " + author;
                }
        );

        m.printReadables(
                (content, author) -> {
                    String becir = "Fadil Fake";
                    return "Fake is reading a " + content + " written by " + author;
                }
        );

        Readable readable = (content, author) -> {
            String becir = "Becir";
            return "Interface is reading! " + content + " written by " + author;
        };
    }

    public void printReadables(Readable readable) {
        System.out.println(readable.read("roman", "Mesa Selimovic"));
    }
}

