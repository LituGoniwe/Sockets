// The skeleton program for Server
import java.net.*;
import java.io.*;

public class Server
{
		private Socket socket=null;
		private ServerSocket server=null;
		private DataInputStream in=null;

		private Server(int port)
		{
			try{
				server=new ServerSocket(port);
				system.out.println("Server started");
				system.out.println("waiting for client to connect....");

				socket=server.accept();
				system.out.println("client connection accepted");

				in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				string line="";
					while(line.equals("Done"))
					{
						try{
							line=in readUTF();
							system.out.println(line);
						}catch(IOExeption i)
						{
							system.out.println(i);
						}
					}
					socket.close();
					in.close();
			}catch(IOExeption i)
			{
					system.out.println(i);
			}
		}

}

    public static void main(String args[])
    {
        Server server = new Server(5000);
    }

