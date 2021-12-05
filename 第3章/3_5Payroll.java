/*
 * @Author: your name
 * @Date: 2021-11-28 16:38:01
 * @LastEditTime: 2021-11-28 16:43:24
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \Clean Code\第三章\3_4Payroll.java
 */
public class Payroll2 {

  public abstract class Employee {

    public abstract boolean isPayday();

    public abstract Money calculatePay();

    public abstract void deliverPay(Money pay);
  }

  public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
  }

  public class EmployeeFactoryImpl implements EmployeeFactory {

    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
      switch (r.type) {
        case COMMISSIONED:
          return new CommissionedEmployee(r);
        case HOURLY:
          return new HourlyEmployee(r);
        case SALARIED:
          return new SalariedEmploye(r);
        default:
          throw new InvalidEmployeeType(r.type);
      }
    }
  }
}
