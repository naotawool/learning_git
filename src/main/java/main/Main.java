package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.EmployeeDomain;
import domain.EmployeeRepository;
import valueobject.EmployeeNo;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {

        log.info("従業員の情報を表示します。");

        // 従業員リポジトリ
        EmployeeRepository repository = new EmployeeRepository();
        log.info("従業員数は {}", repository.count());

        // ドラえもん
        EmployeeDomain doraemon = repository.getByNo(EmployeeNo.of(93));
        log.info(doraemon.toString());
        doraemon.sayGreeting();

        // のび太
        // TODO
        // Hint: EmployeeNo.of(87)

        // しずかちゃん
        // TODO
        // Hint: EmployeeNo.of(5)

        // ジャイアン
        // TODO
        // Hint: EmployeeNo.of(615)

        // スネ夫
        // TODO
        // Hint: EmployeeNo.of(2)
    }
}
