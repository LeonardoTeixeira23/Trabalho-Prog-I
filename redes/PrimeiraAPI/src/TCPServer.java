import java.io.*;
import java.net.*;

class TCPServer
{
	public static void main(String argv[]) throws Exception
	{	
		// frase enviada pelo cliente
		String clientSentence;
		// frase modificada
		String capitalizedSentence;
		// socket de apresentação
		ServerSocket welcomeSocket = new ServerSocket(6789);

		while(true)
		{
			// espera no socket de apresentação pelo contato do cliente
			Socket connectionSocket = welcomeSocket.accept();
			// cria cadeia de entrada conectada ao socket para receber dados do cliente
			BufferedReader inFromClient =
					new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			// cria cadeia de saída conectada ao socket para enviar dados para o cliente
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			// lê mensagem do cliente
			clientSentence = inFromClient.readLine();
			// exibe mensagem do cliente
			System.out.println("Received: " + clientSentence);
			// modifica a string
			capitalizedSentence = clientSentence.toUpperCase() + '\n';
			// envia a string modificaa para o cliente
			outToClient.writeBytes(capitalizedSentence);
		}
	}
}