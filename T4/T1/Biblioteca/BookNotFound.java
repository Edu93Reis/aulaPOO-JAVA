package Biblioteca;

public class BookNotFound extends Exception{

	private String msg;
	
    public BookNotFound(String msg){
      super();
      this.msg = msg;
    }
    
    @Override
    public String getMessage(){
      return "O livro não foi encontrado";
    }
  }
