package main

import (
	"fmt"
)

func split(sum int) (x, y int) {
	x = sum * 4 / 9
	y = sum - x
	return
}

func main() {
	x, y := split(100)
	fmt.Println(x)
	fmt.Println(y)
	fmt.Println(split(17))
}

//func main() {
//	reps, err := http.Get("https://www.baidu.com")
//
//	if err != nil {
//		fmt.Println("Request failed:", err)
//		return
//	}
//	defer reps.Body.Close()
//	body, err := ioutil.ReadAll(reps.Body)
//	if err != nil {
//		fmt.Println("Read body failed:", err)
//		return
//	}
//
//	fmt.Println(string(body))
//}
