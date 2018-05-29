package demo.corespring;

public class MessageService {
	private Message message;
	
	public MessageService(Message message)
	{
			super();
			this.message = message;
	}

	public void printMessage() 
		{
			System.out.println(message.getText());
		}

	}
