package mercadopago.resources;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.mercadopago.exceptions.MPRestException;
import com.mercadopago.resources.PaymentMethod;
import java.util.List;
import org.junit.Test;

public class PaymentMethodTest extends BaseResourceTest {

  @Test
  public void getPaymentMethods() throws MPRestException {
    List<PaymentMethod> response = PaymentMethod.getAll();
    assertNotNull(response);
    assertTrue(response.size() > 0);
  }
}
