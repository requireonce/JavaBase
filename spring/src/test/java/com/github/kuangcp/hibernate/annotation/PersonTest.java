package com.github.kuangcp.hibernate.annotation;

import com.github.kuangcp.common.SpringHelper;
import org.junit.Test;

public class PersonTest extends SpringHelper {

  @Override
  public String getXmlPath() {
    return "proxy/salary/applicationContext.xml";
  }

  @Test
  public void test() {
    PersonService personService = (PersonService) context.getBean("personService");
    Person person = new Person();
    person.setPname("干露露");
    person.setPsex("aaa");
    personService.savePerson(person);
  }
}
