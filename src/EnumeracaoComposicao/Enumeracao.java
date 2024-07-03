package EnumeracaoComposicao;

import java.time.LocalDateTime;

import EnumeracaoComposicao.entities.Order;
import EnumeracaoComposicao.entities.enums.OrderStatus;

public class Enumeracao {
  public static void main(String[] args) {
    Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
    System.out.println(order);

    OrderStatus orderStatus = OrderStatus.DELIVERED;
    OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

    System.out.println(orderStatus);
    System.out.println(orderStatus2);
  }
}
