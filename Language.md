# Baby steps

## Syntax

Clojure has a very simple syntax because it is a Lisp.

### Values

    ;; integer
    1
    42

    ;; Boolean
    true
    false

    ;; String
    "hello"

    ;; Symbol
    'my-symbol

    ;; Keyword
    :my-keyword

    ;; Lists
    '(1 2 3 4 5)

    ;; Vector
    [1 2 3 4 5]

    ;; Map
    {:name "Endy" :car "Subaru Impreza" :number-of-pets 5}

    ;; Set
    #{1 2 3 4}

### Vars

    (def name "Endy")
    (def car "Subaru Impreza")

### Some basic functions on collections

The `count` returns number of items in a collection

    (count [19 "yellow" :silver-man]) ; => 3

The `filter` function selects items from a collection

    (filter odd [1 2 3 4 5]) ; => [1 3 5]

The `remove` function removes items from a collection

    (remove odd [1 2 3 4 5]) ; => [2 4]

The `map` function applies a function to items in a collection

    (map inc [1 2 3]) ; => [2 3 4]
    (map #(* % %) [1 2 3]) ; => [1 4 9]

The `get` function looks up an item in a collection by key

    (get {:name "Endy" :car "Subaru Impreza"} :car) ; => "Subaru Impreza"
    (get [:cat :dog :horse] 0) ; => :dog

The `contains?` function tests if a key is in a set or map

    (contains? #{1 2 3} 2) ; => true
    (contains? {:name "Endy"} :car) ; => false

The `assoc` sets e key/val in a map

    (assoc {:name "Endy"} :car "Subaru Impreza") ; => {:name "Endy" :car "Subaru Impreza"}
