
    fun main(args : Array<String>){

        //print shubham 5 times
        println("print shubham 5 times :")
        for (i in 1..5)
        {
            println("Shubham")
        }

        //print 1 to 10
        println("print 1 to 10 numbers :")
        for (i in 1..10)
        {
            println(i)
        }

        //print even numbers
        println("print even numbers :")
        for (i in 1..10)
        {
            if(i % 2 == 0)
                println(i)
        } //-----------------------------------


        //--------------------------------------
        //print odd numbers
        println("print odd numbers :")
        for (i in 1..10)
        {
            if(i % 2 != 0)
                println(i)
        }


    }