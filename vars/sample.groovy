import com.org.local.hello.*

  def call(body) {
     def config = [: ]
     body.resolveStrategy = Closure.DELEGATE_FIRST
     body.delegate = config
     body()
     
     def nodeLabel = "master"
     s1 = new happy()
     
     try {
         stage ("Test Hello"){
            node (nodeLabel) {
              echo ("Calling / Invoking method")
                s1.welcome()
            }
          }
     }
     catch (err){
       throw err
     }
     finally {
       echo ("Stage completed")
     }
}

