package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = { MyApplication.class })
// @Configuration 설정 클래스는 자동으로 찾지 못함
// @SpringBootConfiguration를 붙여야함(MyApplication)
@SpringBootTest
public class MyApplicationTest02 {

	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
	
}


