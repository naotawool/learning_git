package domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Employee;
import valueobject.EmployeeNo;

/**
 * 一人の従業員を表すドメイン。
 *
 * @author naotake
 */
public class EmployeeDomain {

    private Logger log = LoggerFactory.getLogger(EmployeeDomain.class);

    private Employee entity;

    /**
     * 社員番号を取得する。
     *
     * @see EmployeeNo#toString()
     * @return 社員番号
     */
    public String getNo() {
        return entity.getNo().toString();
    }

    /**
     * 挨拶をします。
     */
    public void sayGreeting() {
        log.info("「{}」", entity.getComment());
    }

    public Employee getEntity() {
        return entity;
    }

    void setEntity(Employee entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return entity.toString();
    }
}
