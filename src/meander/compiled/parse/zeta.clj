(ns meander.compiled.parse.zeta (:require [meander.runtime.zeta]))
(clojure.core/defn parse [input__18639] (let* [ret__14540__auto__ (clojure.core/letfn [(CATA__FN__18641 [input__18639] (clojure.core/letfn [(state__18800 [] (if (clojure.core/vector? input__18639) (clojure.core/letfn [(state__18805 [] (clojure.core/case input__18639 ([meander.dev.zeta/parse-seq []]) (try [{:tag :empty}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))) (state__18806))) (state__18806 [] (if (clojure.core/= (clojure.core/count input__18639) 2) (clojure.core/let [input__18639_nth_0__ (clojure.core/nth input__18639 0) input__18639_nth_1__ (clojure.core/nth input__18639 1)] (clojure.core/letfn [(state__18812 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-seq)) (if (clojure.core/vector? input__18639_nth_1__) (clojure.core/let [n__18646 (clojure.core/count input__18639_nth_1__) m__18647 (clojure.core/max 0 (clojure.core/- n__18646 2)) input__18639_nth_1___l__ (clojure.core/subvec input__18639_nth_1__ 0 (clojure.core/min (clojure.core/count input__18639_nth_1__) m__18647)) input__18639_nth_1___r__ (clojure.core/subvec input__18639_nth_1__ m__18647)] (if (clojure.core/= (clojure.core/count input__18639_nth_1___r__) 2) (clojure.core/let [!xs (clojure.core/vec input__18639_nth_1___l__)] (if (clojure.core/= (clojure.core/count input__18639_nth_1___r__) 2) (clojure.core/let [input__18639_nth_1___r___nth_0__ (clojure.core/nth input__18639_nth_1___r__ 0) input__18639_nth_1___r___nth_1__ (clojure.core/nth input__18639_nth_1___r__ 1)] (clojure.core/case input__18639_nth_1___r___nth_0__ (:meander.zeta/as) (clojure.core/let [?pattern input__18639_nth_1___r___nth_1__] (try [(clojure.core/let [!xs__counter (meander.runtime.zeta/iterator !xs)] {:tag :as, :pattern (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 ?pattern)] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))), :next (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) (clojure.core/into [] (clojure.core/vec (meander.substitute.runtime.epsilon/iterator-seq !xs__counter)))])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))})] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (state__18813))) (state__18813))) (state__18813))) (state__18813)) (state__18813))) (state__18813 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-seq)) (if (clojure.core/vector? input__18639_nth_1__) (if (clojure.core/= (clojure.core/count input__18639_nth_1__) 2) (clojure.core/let [input__18639_nth_1___nth_0__ (clojure.core/nth input__18639_nth_1__ 0) input__18639_nth_1___nth_1__ (clojure.core/nth input__18639_nth_1__ 1)] (if (clojure.core/symbol? input__18639_nth_1___nth_0__) (clojure.core/let [X__18655 (clojure.core/namespace input__18639_nth_1___nth_0__)] (clojure.core/case X__18655 ("meander.zeta") (clojure.core/let [X__18657 (clojure.core/name input__18639_nth_1___nth_0__)] (if (clojure.core/string? X__18657) (if (clojure.core/re-matches #"&.*" X__18657) (clojure.core/let [?pattern input__18639_nth_1___nth_1__] (try [(clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 ?pattern)] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (state__18814)) (state__18814))) (state__18814))) (state__18814))) (state__18814)) (state__18814)) (state__18814))) (state__18814 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-seq)) (if (clojure.core/vector? input__18639_nth_1__) (clojure.core/let [n__18660 (clojure.core/count input__18639_nth_1__) m__18661 (clojure.core/max 0 (clojure.core/- n__18660 2)) input__18639_nth_1___l__ (clojure.core/subvec input__18639_nth_1__ 0 (clojure.core/min (clojure.core/count input__18639_nth_1__) m__18661)) input__18639_nth_1___r__ (clojure.core/subvec input__18639_nth_1__ m__18661)] (if (clojure.core/= (clojure.core/count input__18639_nth_1___r__) 2) (clojure.core/let [!xs (clojure.core/vec input__18639_nth_1___l__)] (if (clojure.core/= (clojure.core/count input__18639_nth_1___r__) 2) (clojure.core/let [input__18639_nth_1___r___nth_0__ (clojure.core/nth input__18639_nth_1___r__ 0) input__18639_nth_1___r___nth_1__ (clojure.core/nth input__18639_nth_1___r__ 1)] (if (clojure.core/symbol? input__18639_nth_1___r___nth_0__) (clojure.core/let [X__18665 (clojure.core/namespace input__18639_nth_1___r___nth_0__)] (clojure.core/case X__18665 ("meander.zeta") (clojure.core/let [X__18667 (clojure.core/name input__18639_nth_1___r___nth_0__)] (if (clojure.core/string? X__18667) (if (clojure.core/re-matches #"&.*" X__18667) (clojure.core/let [?pattern input__18639_nth_1___r___nth_1__] (try [(clojure.core/let [!xs__counter (meander.runtime.zeta/iterator !xs)] {:tag :join, :left (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) (clojure.core/into [] (clojure.core/vec (meander.substitute.runtime.epsilon/iterator-seq !xs__counter)))])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))), :right (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 ?pattern)] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))})] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (state__18815)) (state__18815))) (state__18815))) (state__18815))) (state__18815))) (state__18815))) (state__18815)) (state__18815))) (state__18815 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-seq)) (if (clojure.core/vector? input__18639_nth_1__) (clojure.core/let [input__18639_nth_1___l__ (clojure.core/subvec input__18639_nth_1__ 0 (clojure.core/min (clojure.core/count input__18639_nth_1__) 1))] (if (clojure.core/= (clojure.core/count input__18639_nth_1___l__) 1) (clojure.core/let [input__18639_nth_1___r__ (clojure.core/subvec input__18639_nth_1__ 1)] (if (clojure.core/= input__18639_nth_1___l__ [(quote .)]) (clojure.core/let [?rest input__18639_nth_1___r__] (try [(clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) ?rest])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (state__18816))) (state__18816))) (state__18816)) (state__18816))) (state__18816 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-seq)) (if (clojure.core/vector? input__18639_nth_1__) (clojure.core/loop [search_space__18819 (meander.match.runtime.epsilon/partitions 2 input__18639_nth_1__)] (if (clojure.core/seq search_space__18819) (clojure.core/let [input__18639_nth_1___parts__ (clojure.core/first search_space__18819) result__18820 (clojure.core/let [input__18639_nth_1___l__ (clojure.core/nth input__18639_nth_1___parts__ 0) input__18639_nth_1___r__ (clojure.core/nth input__18639_nth_1___parts__ 1)] (clojure.core/let [!xs (clojure.core/vec input__18639_nth_1___l__)] (clojure.core/let [input__18639_nth_1___r___l__ (clojure.core/subvec input__18639_nth_1___r__ 0 (clojure.core/min (clojure.core/count input__18639_nth_1___r__) 1))] (if (clojure.core/= (clojure.core/count input__18639_nth_1___r___l__) 1) (clojure.core/let [input__18639_nth_1___r___r__ (clojure.core/subvec input__18639_nth_1___r__ 1)] (if (clojure.core/= input__18639_nth_1___r___l__ [(quote .)]) (clojure.core/let [?rest input__18639_nth_1___r___r__] (try [(clojure.core/let [!xs__counter (meander.runtime.zeta/iterator !xs)] (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/join-args) {:tag :join, :left (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) (clojure.core/into [] (clojure.core/vec (meander.substitute.runtime.epsilon/iterator-seq !xs__counter)))])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))), :right (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) ?rest])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))}])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))))] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (meander.runtime.zeta/fail))) (meander.runtime.zeta/fail)))))] (if (meander.runtime.zeta/fail? result__18820) (recur (clojure.core/next search_space__18819)) result__18820)) (state__18817))) (state__18817)) (state__18817))) (state__18817 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-seq)) (if (clojure.core/vector? input__18639_nth_1__) (clojure.core/let [input__18639_nth_1___l__ (clojure.core/subvec input__18639_nth_1__ 0 (clojure.core/min (clojure.core/count input__18639_nth_1__) 1))] (if (clojure.core/= (clojure.core/count input__18639_nth_1___l__) 1) (clojure.core/let [input__18639_nth_1___r__ (clojure.core/subvec input__18639_nth_1__ 1)] (if (clojure.core/= input__18639_nth_1___l__ [(quote ...)]) (clojure.core/let [?rest input__18639_nth_1___r__] (try [(clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) ?rest])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (state__18818))) (state__18818))) (state__18818)) (state__18818))) (state__18818 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-seq)) (if (clojure.core/vector? input__18639_nth_1__) (clojure.core/loop [search_space__18822 (meander.match.runtime.epsilon/partitions 2 input__18639_nth_1__)] (if (clojure.core/seq search_space__18822) (clojure.core/let [input__18639_nth_1___parts__ (clojure.core/first search_space__18822) result__18823 (clojure.core/let [input__18639_nth_1___l__ (clojure.core/nth input__18639_nth_1___parts__ 0) input__18639_nth_1___r__ (clojure.core/nth input__18639_nth_1___parts__ 1)] (clojure.core/let [!xs (clojure.core/vec input__18639_nth_1___l__)] (clojure.core/let [input__18639_nth_1___r___l__ (clojure.core/subvec input__18639_nth_1___r__ 0 (clojure.core/min (clojure.core/count input__18639_nth_1___r__) 1))] (if (clojure.core/= (clojure.core/count input__18639_nth_1___r___l__) 1) (clojure.core/let [input__18639_nth_1___r___r__ (clojure.core/subvec input__18639_nth_1___r__ 1)] (if (clojure.core/= input__18639_nth_1___r___l__ [(quote ...)]) (clojure.core/let [?rest input__18639_nth_1___r___r__] (try [(clojure.core/let [!xs__counter (meander.runtime.zeta/iterator !xs)] (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/star-args) (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) (clojure.core/into [] (clojure.core/vec (meander.substitute.runtime.epsilon/iterator-seq !xs__counter)))])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))) (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) ?rest])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))))] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (meander.runtime.zeta/fail))) (meander.runtime.zeta/fail)))))] (if (meander.runtime.zeta/fail? result__18823) (recur (clojure.core/next search_space__18822)) result__18823)) (state__18807))) (state__18807)) (state__18807)))] (state__18812))) (state__18807))) (state__18807 [] (if (clojure.core/= (clojure.core/count input__18639) 3) (clojure.core/let [input__18639_nth_0__ (clojure.core/nth input__18639 0) input__18639_nth_1__ (clojure.core/nth input__18639 1) input__18639_nth_2__ (clojure.core/nth input__18639 2)] (clojure.core/letfn [(state__18825 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/star-args)) (if (clojure.core/map? input__18639_nth_1__) (clojure.core/let [VAL__18690 (.valAt input__18639_nth_1__ :tag)] (clojure.core/case VAL__18690 (:cat) (clojure.core/let [VAL__18691 (.valAt input__18639_nth_1__ :sequence)] (if (clojure.core/vector? VAL__18691) (if (clojure.core/= (clojure.core/count VAL__18691) 1) (clojure.core/let [VAL__18691_nth_0__ (clojure.core/nth VAL__18691 0)] (if (clojure.core/map? VAL__18691_nth_0__) (clojure.core/let [VAL__18696 (.valAt VAL__18691_nth_0__ :tag)] (clojure.core/case VAL__18696 (:memory-variable) (clojure.core/let [?memory-variable VAL__18691_nth_0__] (clojure.core/let [VAL__18692 (.valAt input__18639_nth_1__ :next)] (if (clojure.core/map? VAL__18692) (clojure.core/let [VAL__18693 (.valAt VAL__18692 :tag)] (clojure.core/case VAL__18693 (:empty) (clojure.core/let [?next input__18639_nth_2__] (try [(clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/join-args) {:tag :join, :left {:tag :into, :memory-variable ?memory-variable}, :right ?next}])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (state__18826))) (state__18826)))) (state__18826))) (state__18826))) (state__18826)) (state__18826))) (state__18826))) (state__18826)) (state__18826))) (state__18826 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/star-args)) (clojure.core/let [?pattern input__18639_nth_1__] (clojure.core/let [?next input__18639_nth_2__] (try [{:tag :star, :pattern ?pattern, :next ?next}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))) (state__18808)))] (state__18825))) (state__18808))) (state__18808 [] (if (clojure.core/= (clojure.core/count input__18639) 2) (clojure.core/let [input__18639_nth_0__ (clojure.core/nth input__18639 0) input__18639_nth_1__ (clojure.core/nth input__18639 1)] (clojure.core/letfn [(state__18827 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-seq)) (if (clojure.core/vector? input__18639_nth_1__) (clojure.core/let [!xs (clojure.core/vec input__18639_nth_1__)] (try [(clojure.core/let [!xs__counter (meander.runtime.zeta/iterator !xs)] {:tag :cat, :sequence (clojure.core/let [return__18642 (clojure.core/transient [])] (clojure.core/while (clojure.core/and (.hasNext !xs__counter)) (clojure.core/conj! return__18642 (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 (if (.hasNext !xs__counter) (.next !xs__counter)))] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))))) (clojure.core/persistent! return__18642)), :next {:tag :empty}})] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (state__18828)) (state__18828))) (state__18828 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/join-args)) (if (clojure.core/map? input__18639_nth_1__) (clojure.core/let [VAL__18705 (.valAt input__18639_nth_1__ :tag)] (clojure.core/case VAL__18705 (:join) (clojure.core/let [VAL__18706 (.valAt input__18639_nth_1__ :left)] (if (clojure.core/map? VAL__18706) (clojure.core/let [VAL__18707 (.valAt VAL__18706 :tag)] (clojure.core/case VAL__18707 (:cat) (clojure.core/let [VAL__18708 (.valAt VAL__18706 :sequence)] (clojure.core/let [?sequence VAL__18708] (clojure.core/let [VAL__18709 (.valAt VAL__18706 :next)] (if (clojure.core/map? VAL__18709) (clojure.core/let [VAL__18710 (.valAt VAL__18709 :tag)] (clojure.core/case VAL__18710 (:empty) (clojure.core/let [VAL__18711 (.valAt input__18639_nth_1__ :right)] (clojure.core/let [?right VAL__18711] (clojure.core/let [VAL__18712 (.valAt input__18639_nth_1__ :form)] (clojure.core/let [?form VAL__18712] (try [{:tag :cat, :sequence ?sequence, :next ?right}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))))) (state__18829))) (state__18829))))) (state__18829))) (state__18829))) (state__18829))) (state__18829)) (state__18829))) (state__18829 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/join-args)) (if (clojure.core/map? input__18639_nth_1__) (clojure.core/let [VAL__18715 (.valAt input__18639_nth_1__ :tag)] (clojure.core/case VAL__18715 (:join) (clojure.core/let [VAL__18716 (.valAt input__18639_nth_1__ :left)] (clojure.core/let [?left VAL__18716] (clojure.core/let [VAL__18717 (.valAt input__18639_nth_1__ :right)] (if (clojure.core/map? VAL__18717) (clojure.core/let [VAL__18718 (.valAt VAL__18717 :tag)] (clojure.core/case VAL__18718 (:empty) (clojure.core/let [VAL__18719 (.valAt input__18639_nth_1__ :form)] (clojure.core/let [?form VAL__18719] (try [?left] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))) (state__18830))) (state__18830))))) (state__18830))) (state__18830)) (state__18830))) (state__18830 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/join-args)) (clojure.core/let [?ast input__18639_nth_1__] (try [?ast] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (state__18831))) (state__18831 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-entries)) (if (clojure.core/map? input__18639_nth_1__) (clojure.core/let [VAL__18724 (.valAt input__18639_nth_1__ :meander.zeta/as)] (clojure.core/let [?pattern VAL__18724] (clojure.core/let [X__18726 ((clojure.core/fn [m__13426__auto__] (clojure.core/dissoc m__13426__auto__ :meander.zeta/as)) input__18639_nth_1__)] (clojure.core/let [?rest X__18726] (clojure.core/letfn [(save__18727 [] (state__18832)) (f__18835 [] (try [{:tag :as, :pattern ?pattern, :next (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 ?rest)] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))] (if (clojure.core/= ?rest input__18639_nth_1__) (save__18727) (f__18835))))))) (state__18832)) (state__18832))) (state__18832 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-entries)) (if (clojure.core/map? input__18639_nth_1__) (clojure.core/let [X__18731 (clojure.core/set input__18639_nth_1__)] (if (clojure.core/<= 1 (clojure.core/count X__18731)) (clojure.core/loop [search_space__18836 (clojure.core/seq X__18731)] (if (clojure.core/seq search_space__18836) (clojure.core/let [elem__18732 (clojure.core/first search_space__18836) result__18837 (clojure.core/let [elem__18732_nth_0__ (clojure.core/nth elem__18732 0) elem__18732_nth_1__ (clojure.core/nth elem__18732 1)] (clojure.core/let [*m__18640 elem__18732_nth_0__] (if (clojure.core/symbol? elem__18732_nth_0__) (clojure.core/let [X__18734 (clojure.core/namespace elem__18732_nth_0__)] (clojure.core/case X__18734 ("meander.zeta") (clojure.core/let [X__18736 (clojure.core/name elem__18732_nth_0__)] (if (clojure.core/string? X__18736) (if (clojure.core/re-matches #"&.*" X__18736) (clojure.core/let [?pattern elem__18732_nth_1__] (clojure.core/let [X__18738 ((clojure.core/fn [m__13426__auto__] (clojure.core/dissoc m__13426__auto__ *m__18640)) input__18639_nth_1__)] (clojure.core/let [?rest X__18738] (try [{:tag :rest-map, :pattern ?pattern, :next (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-entries) ?rest])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))))) (meander.runtime.zeta/fail)) (meander.runtime.zeta/fail))) (meander.runtime.zeta/fail))) (meander.runtime.zeta/fail))))] (if (meander.runtime.zeta/fail? result__18837) (recur (clojure.core/next search_space__18836)) result__18837)) (state__18833))) (state__18833))) (state__18833)) (state__18833))) (state__18833 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-entries)) (if (clojure.core/map? input__18639_nth_1__) (clojure.core/let [X__18742 (clojure.core/set input__18639_nth_1__)] (if (clojure.core/<= 1 (clojure.core/count X__18742)) (clojure.core/loop [search_space__18839 (clojure.core/seq X__18742)] (if (clojure.core/seq search_space__18839) (clojure.core/let [elem__18743 (clojure.core/first search_space__18839) result__18840 (clojure.core/let [elem__18743_nth_0__ (clojure.core/nth elem__18743 0) elem__18743_nth_1__ (clojure.core/nth elem__18743 1)] (clojure.core/let [?key-pattern elem__18743_nth_0__] (clojure.core/let [?val-pattern elem__18743_nth_1__] (clojure.core/let [X__18745 ((clojure.core/fn [m__13426__auto__] (clojure.core/dissoc m__13426__auto__ ?key-pattern)) input__18639_nth_1__)] (clojure.core/let [?rest X__18745] (try [{:tag :entry, :key-pattern (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 ?key-pattern)] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))), :val-pattern (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 ?val-pattern)] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))), :next (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-entries) ?rest])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))))))] (if (meander.runtime.zeta/fail? result__18840) (recur (clojure.core/next search_space__18839)) result__18840)) (state__18834))) (state__18834))) (state__18834)) (state__18834))) (state__18834 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-entries)) (if (clojure.core/map? input__18639_nth_1__) (try [{:tag :some-map}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))) (state__18809)) (state__18809)))] (state__18827))) (state__18809))) (state__18809 [] (clojure.core/case input__18639 ([meander.dev.zeta/parse-with-bindings []]) (try [[]] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))) (state__18810))) (state__18810 [] (if (clojure.core/= (clojure.core/count input__18639) 2) (clojure.core/let [input__18639_nth_0__ (clojure.core/nth input__18639 0) input__18639_nth_1__ (clojure.core/nth input__18639 1)] (clojure.core/letfn [(state__18842 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-with-bindings)) (if (clojure.core/vector? input__18639_nth_1__) (if (clojure.core/= (clojure.core/count input__18639_nth_1__) 1) (try [[{:tag :error, :message "meander.zeta/with expects an even number of bindings"}]] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))) (state__18843)) (state__18843)) (state__18843))) (state__18843 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-with-bindings)) (if (clojure.core/vector? input__18639_nth_1__) (clojure.core/let [input__18639_nth_1___l__ (clojure.core/subvec input__18639_nth_1__ 0 (clojure.core/min (clojure.core/count input__18639_nth_1__) 2))] (if (clojure.core/= (clojure.core/count input__18639_nth_1___l__) 2) (clojure.core/let [input__18639_nth_1___r__ (clojure.core/subvec input__18639_nth_1__ 2)] (clojure.core/let [input__18639_nth_1___l___nth_0__ (clojure.core/nth input__18639_nth_1___l__ 0) input__18639_nth_1___l___nth_1__ (clojure.core/nth input__18639_nth_1___l__ 1)] (if (clojure.core/symbol? input__18639_nth_1___l___nth_0__) (clojure.core/let [X__18757 (clojure.core/namespace input__18639_nth_1___l___nth_0__)] (clojure.core/let [X__18759 (clojure.core/name input__18639_nth_1___l___nth_0__)] (if (clojure.core/string? X__18759) (if (clojure.core/re-matches #"%.+" X__18759) (clojure.core/let [?symbol input__18639_nth_1___l___nth_0__] (clojure.core/let [?pattern input__18639_nth_1___l___nth_1__] (clojure.core/let [?rest input__18639_nth_1___r__] (try [(clojure.core/into [] (clojure.core/concat (clojure.core/list {:tag :with-binding, :reference {:tag :reference, :symbol ?symbol, :form ?symbol}, :pattern (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 ?pattern)] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))}) (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-with-bindings) ?rest])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))))] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))))) (state__18844)) (state__18844)))) (state__18844)))) (state__18844))) (state__18844)) (state__18844))) (state__18844 [] (if (clojure.core/= input__18639_nth_0__ (quote meander.dev.zeta/parse-with-bindings)) (if (clojure.core/vector? input__18639_nth_1__) (clojure.core/let [input__18639_nth_1___l__ (clojure.core/subvec input__18639_nth_1__ 0 (clojure.core/min (clojure.core/count input__18639_nth_1__) 2))] (if (clojure.core/= (clojure.core/count input__18639_nth_1___l__) 2) (clojure.core/let [input__18639_nth_1___r__ (clojure.core/subvec input__18639_nth_1__ 2)] (clojure.core/let [input__18639_nth_1___l___nth_0__ (clojure.core/nth input__18639_nth_1___l__ 0) input__18639_nth_1___l___nth_1__ (clojure.core/nth input__18639_nth_1___l__ 1)] (clojure.core/let [?x input__18639_nth_1___l___nth_0__] (clojure.core/let [?pattern input__18639_nth_1___l___nth_1__] (clojure.core/let [?rest input__18639_nth_1___r__] (try [[{:tag :error, :message "meander.zeta/with bindings must be an repeating sequence of %name pattern"}]] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))))))) (state__18811))) (state__18811)) (state__18811)))] (state__18842))) (state__18811))) (state__18811 [] (clojure.core/let [?sequence input__18639] (try [{:tag :vector, :next (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) ?sequence])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))), :form ?sequence}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))))] (state__18805)) (state__18801))) (state__18801 [] (if (clojure.core/seq? input__18639) (clojure.core/letfn [(state__18845 [] (if (clojure.core/= (clojure.core/bounded-count (clojure.core/inc 3) input__18639) 3) (clojure.core/let [input__18639_nth_0__ (clojure.core/nth input__18639 0) input__18639_nth_1__ (clojure.core/nth input__18639 1) input__18639_nth_2__ (clojure.core/nth input__18639 2)] (clojure.core/case input__18639_nth_0__ (meander.zeta/with) (clojure.core/let [?bindings input__18639_nth_1__] (clojure.core/let [?body input__18639_nth_2__] (clojure.core/let [?form input__18639] (try [{:tag :with, :bindings {:tag :with-bindings, :bindings (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-with-bindings) ?bindings])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0)))}, :body (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 ?body)] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))), :form ?form}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))))) (state__18846))) (state__18846))) (state__18846 [] (clojure.core/let [?sequence input__18639] (try [{:tag :seq, :next (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-seq) (clojure.core/into [] ?sequence)])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))), :form ?sequence}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))))] (state__18845)) (state__18802))) (state__18802 [] (if (clojure.core/map? input__18639) (clojure.core/let [?map input__18639] (try [{:tag :map, :next (clojure.core/let [CATA_RESULT__15663__auto__ (CATA__FN__18641 [(quote meander.dev.zeta/parse-entries) ?map])] (if (meander.runtime.zeta/fail? CATA_RESULT__15663__auto__) (throw (meander.runtime.zeta/fail)) (clojure.core/nth CATA_RESULT__15663__auto__ 0))), :form ?map}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))) (state__18803))) (state__18803 [] (if (clojure.core/symbol? input__18639) (clojure.core/let [X__18771 (clojure.core/namespace input__18639)] (clojure.core/let [X__18773 (clojure.core/name input__18639)] (if (clojure.core/string? X__18773) (clojure.core/letfn [(state__18847 [] (clojure.core/let [ret__18774 (clojure.core/re-matches #"_.*" X__18773)] (if (clojure.core/some? ret__18774) (clojure.core/let [?name ret__18774] (clojure.core/let [?symbol input__18639] (try [{:tag :wildcard, :name ?name, :form ?symbol, :symbol ?symbol}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))) (state__18848)))) (state__18848 [] (clojure.core/let [ret__18779 (clojure.core/re-matches #".+#" X__18773)] (if (clojure.core/some? ret__18779) (clojure.core/let [?name ret__18779] (clojure.core/let [?symbol input__18639] (try [{:tag :random-symbol, :name ?name, :form ?symbol, :symbol ?symbol}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))) (state__18849)))) (state__18849 [] (clojure.core/let [ret__18784 (clojure.core/re-matches #"%.+" X__18773)] (if (clojure.core/some? ret__18784) (clojure.core/let [?name ret__18784] (clojure.core/let [?symbol input__18639] (try [{:tag :reference, :name ?name, :symbol ?symbol}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))) (state__18850)))) (state__18850 [] (clojure.core/let [ret__18789 (clojure.core/re-matches #"\*.+" X__18773)] (if (clojure.core/some? ret__18789) (clojure.core/let [?name ret__18789] (clojure.core/let [?symbol input__18639] (try [{:tag :mutable-variable, :name ?name, :symbol ?symbol}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))) (state__18851)))) (state__18851 [] (clojure.core/let [ret__18794 (clojure.core/re-matches #"\!.+" X__18773)] (if (clojure.core/some? ret__18794) (clojure.core/let [?name ret__18794] (clojure.core/let [?symbol input__18639] (try [{:tag :memory-variable, :name ?name, :symbol ?symbol}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))) (state__18852)))) (state__18852 [] (clojure.core/let [ret__18799 (clojure.core/re-matches #"\?.+" X__18773)] (if (clojure.core/some? ret__18799) (clojure.core/let [?name ret__18799] (clojure.core/let [?symbol input__18639] (try [{:tag :logic-variable, :name ?name, :symbol ?symbol}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__)))))) (state__18804))))] (state__18847)) (state__18804)))) (state__18804))) (state__18804 [] (clojure.core/let [?x input__18639] (try [{:tag :literal, :form ?x}] (catch java.lang.Exception e__16603__auto__ (if (meander.runtime.zeta/fail? e__16603__auto__) (meander.runtime.zeta/fail) (throw e__16603__auto__))))))] (state__18800)))] (clojure.core/let [x__14360__auto__ (CATA__FN__18641 input__18639)] (if (meander.runtime.zeta/fail? x__14360__auto__) (meander.runtime.zeta/fail) (clojure.core/let [[CATA_RETURN__18643] x__14360__auto__] CATA_RETURN__18643))))] (if (meander.runtime.zeta/fail? ret__14540__auto__) nil ret__14540__auto__)))