package org.example.myapp;

import com.google.common.base.Joiner;
import org.example.util.Utils;

/**
 * 이 클래스는 한밭대학교 특강 실습 예제를 위한 첫 번째 클래스입니다.<br>
 * <code>App</code> 클래스!
 */
public class App {

  /**
   * 이 메서드는 entry point 이다. 콘솔에 "Hello!" 메세지를 출력합니다.
   *
   * @param args 명령행 인수 배열(이 프로그램에서는 사용되지 않음)
   */
  public static void main(String[] args) {
    Utils.printMessage("Hello!");
    String message = Joiner.on(", ").join("hello", "world");
  }
}
