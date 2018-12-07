import org.junit.Test;
import static org.junit.Assert.*;
import com.example.PIAproximate;

public class TestePI {
  
  @Test
  public void Teste1() {
      PIAproximate pi = new PIAproximate();
      assertEquals(3.1415826535897198, pi.getPI(100000));
  }
  
}