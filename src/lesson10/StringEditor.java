package lesson10;

public class StringEditor {
    private String string;

    public void setString(String string) {
        this.string = string;
    }

    public void printLastChar() {
        System.out.println(string.charAt(string.length() - 1));
    }

    public boolean getStringEnd(String endString) {
        return string.endsWith(endString);
    }

    public boolean getStringStart(String startString) {
        return string.startsWith(startString);
    }

    public boolean getContains(String contString) {
        return string.contains(contString);
    }

    public int getIndexOf(String indexString) {
        return string.indexOf(indexString);
    }

    public String getReplace() {
        return string.replace('a', 'o');
    }

    public String getUpper() {
        return string.toUpperCase();
    }

    public String getLower() {
        return string.toLowerCase();
    }
    public String getSubstring(String subsString){
        return string.substring(0,string.indexOf(subsString))+string.substring(string.indexOf(subsString)+subsString.length());
    }
}
