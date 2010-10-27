package sample.clone;

public class TestCloneable {
	  static Ordinary tryToClone(Ordinary ord) {
		    String id = ord.getClass().getName();
		    Ordinary x = null;
		    if(ord instanceof Cloneable) {
		      try {
		        System.out.println("Попытка клонирования " + id);
		        x = (Ordinary)((IsCloneable)ord).clone();
		        System.out.println("Клонирован " + id);
		      } catch(CloneNotSupportedException e) {
		        System.err.println("Не удается клонировать "+id);
		      }
		    }
		    return x;
		  }
		  public static void main(String[] args) {
		    // Подмена типов:
		    Ordinary[] ord = { 
		      new IsCloneable(),
		      new WrongClone(),
		      new NoMore(),
		      new TryMore(),
		      new BackOn(),
		      new ReallyNoMore(),
		    };
		    Ordinary x = new Ordinary();
		    // Это не удастся откомпилировать, пока clone()
		    // описан как protected в классе Object:
		    //! x = (Ordinary)x.clone();
		    // tryToClone() сначала осуществляет проверку чтобы
		    // определить, реализует ли данный класс интерфейс Cloneable:
		    for(int i = 0; i < ord.length; i++)
		      tryToClone(ord[i]);
		  }

}
