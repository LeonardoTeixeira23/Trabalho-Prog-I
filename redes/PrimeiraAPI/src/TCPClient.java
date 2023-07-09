import java.io.*;
import java.net.*;

class TCPClient
{
	public static void main(String argv[]) throws Exception
	{
		// frase que será enviada
		String sentence;
		// frase alterada que será recebida
		String modifiedSentence;
		// cria cadeia de entrada (teclado)
		BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
		// cria socket do cliente
		Socket clientSocket = new Socket("200.132.31.224", 6789);
		// cria cadeia de saída conectada ao socket para enviar dados para o servidor
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		// cria cadeia de entrada conectada ao socket para receber dados do servidor
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		// lê linha do teclado
		sentence = inFromUser.readLine();
		// envia dados para o servidor
		outToServer.writeBytes(sentence);
		// lê informações do servidor
		modifiedSentence = inFromServer.readLine();
		// exibe mensagem de resposta
		System.out.println("FROM SERVER: " + modifiedSentence);
		// fecha o socket
		clientSocket.close();
	}
}