/* TODO
Imports will be filling up as you need them. */
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class WebPage {
    public List<String> dom; // this actually has the html document model.

    public WebPage(){
        dom = new LinkedList<>();/* TODO
Initialize this to some kind of List */;
    }

    public void addTitle(String title){
        /* TODO 
Add a title to the DOM*/
        dom.add("<h1>"+title+"</h1>");
    }
    public void addParagraph(String p){
        /* TODO
Add a title to the DOM*/
        dom.add("<p>"+p+"</p>");
    }
    /* TODO 
implement addParagraph that receives a String and puts it in the dom 
surrounded by <p> and </p>*/
    public String toString(){
        String html = "<html>\n<head>\n</head>\n<body>";
        /* TODO
Loop through the elemments of the dom and append them to html */
        for (String e : dom) {
            html += e;
        }
        return html+"</body>\n</html>";
    }

    public void save(String filename){
        /* TODO 
Save a string representation of this webpage to the filename provided.*/
        try {
            FileWriter w = new FileWriter(filename);
            w.write(toString());
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
