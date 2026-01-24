package sec.exam02.`var`

import java.text.DecimalFormat

fun main(args : Array<String>) {

    var a : Long = 100L;
    var b : Int = 10
    var c = 1_000_000_000;
    var d : Byte = 127;

    var num1 = 127                  // Int형으로 추론
    var num2 = -32768               // Int형으로 추론
    var num3 = 214741111            // Int형으로 추론
    var num4 = 99999999999999999    // Long형으로 추론
    val num5 = 123L;                // Long형으로 추론

    var ux : UInt = 153u;           // 부호 없는 정수
    //ux  = -153                      // error

    val decimal = DecimalFormat("#,###");
    var num6 = 1_000_000;
    println(decimal.format(num6));
}