package com.example.controlflow3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var now = 10
        when(now){
            8 -> {
                Log.d("when", "현재 시간은 8시입니다.")
            }
            9 -> {
                Log.d("when", "현재 시간은 9시입니다.")
            }
            else -> {   //위의 모든 조건에 맞지 않는다면 else 다음 코드가 실행
                Log.d("when", "현재 시간은 9시가 아닙니다.")
            }
        }

        //콤마로 구분해서 when 사용하기
        var now2 = 10
        when(now2){
            8,9 -> {
                Log.d("when", "현재 시간은 8시 또는 9시 입니다.")
            }

            else -> {   //위의 모든 조건에 맞지 않는다면 else 다음 코드가 실행
                Log.d("when", "현재 시간은 9시가 아닙니다.")
            }
        }

        //범위 값을 비교하기
        var ageOfMichael = 19
        when(ageOfMichael){
            in 10..19 -> {
                    Log.d("when", "마이클은 10대입니다.")
            }
            !in 10..19 -> { //범위 앞에 느낌표 추가
                Log.d("when", "마이클은 10대가 아닙니다.")
            }

            else -> {   //위의 모든 조건에 맞지 않는다면 else 다음 코드가 실행
                Log.d("when", "마이클의 나이를 알 수 없습니다.")
            }
        }

        //파라미터 없는 when 사용하기
        var currentTime = 6
        when{
            currentTime == 5 -> {
                Log.d("when", "현재 시간은 5시 입니다.")
            }

            currentTime > 5 -> {
                Log.d("when", "현재 시간은 5시가 넘었습니다.")
            }
            else -> {
                Log.d("when", "현재 시간은 5시 이전입니다.")
            }
        }

        //조건식으로 if문을 사용하는 경우 : 범위를 한정할 수 없고, 갯수가 많은 경우
        //조건식으로 when문을 사용하는 경우 : 값을 특정할 수 있고, 갯수가 한정되어 있는 경우
    }
}