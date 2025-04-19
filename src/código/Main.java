package teste;
import org.jsoup.nodes.Document;
import java.io.IOException;
import org.jsoup.Jsoup;

public class Main {
	public static void main(String[] args) throws IOException {
	
		Document doc = Jsoup.connect("https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos").get();
		
		System.out.println(doc);
		
	}
}
