import java.util.Scanner;
//import java.net.URI;
//import java.net.URISyntaxException;
class q24 {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String urlString = sc.nextLine();
        String domainName = getDomainExtension(urlString);
        String domainType = determineWebsiteType(domainName);
        System.out.println("The website type is: "+domainType);
        sc.close();
    }
    
    public static String getDomainExtension(String urlString) {
        String[] parts = urlString.split("\\.");
        if(parts.length>0) return parts[parts.length -1];
        else return null;
    }
    
    public static String determineWebsiteType(String extension) {
        String lowerCaseExtension = extension.toLowerCase();
        
        switch (lowerCaseExtension) {
            case "com":
                return "Commercial website";
            case "org":
                return "Non-profit organization";
            case "edu":
                return "Educational institution";
            case "info":
                return "Informational website";
            case "net":
                return "Network-related website";
            default:
                return "Unknown or other types of websites";
        }
    }
}