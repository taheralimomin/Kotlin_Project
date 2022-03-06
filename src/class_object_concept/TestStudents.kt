package class_object_concept

import java.awt.Stroke

class TestStudents {

    var stud_no = 2020095900026102L
    var stud_name = "Jhon Smith"
    var stud_city :String? = ""
    var stud_deptName : String? = ""

    fun insert(city : String, depart : String){

        stud_city = city
        stud_deptName = depart
    }

    fun show(){

        println("Student PRN Number ------> $stud_no")
        println("Student Name ---> $stud_name")
    }
    fun disp(){
        print("\n")
        println("Student PRN Number ------> $stud_no")
        println("Student Name ---> $stud_name")
        println("Student City ---> $stud_city")
        println("Student Department -----> $stud_deptName")
    }
}



fun main(){


    val st = TestStudents()
    st.show()
    st.stud_no = 2020095900026103L
    st.stud_name = "Sonam Jadeja"
    st.insert("Ahmedabad", "Science")
    st.disp()
}