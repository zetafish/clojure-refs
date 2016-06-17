(set-env!
 :resource-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.8.0" :scope "provided"]])

(deftask build
  []
  (comp
   (aot :namespace #{'hello.core})
   (pom :project 'hello :version "0.0.1")
   (uber :exclude [#"pom.xml"])
   (jar :main 'hello.core)
   (target)))
