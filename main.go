package main

import (
	"io"
	"net/http"
	"os"
	"strings"
	"time"
)

func main()  {
	start := time.Now()
	out, err := os.Create("apiOut.txt")
	for i:=1; i < 100; i++ {
		res, err := http.Get("https://mocki.io/v1/4db46207-0123-4e68-88cf-f0147997b152")
		resBytes, err := io.ReadAll(res.Body)
		resStr := string(resBytes) + "\n"
		if err != nil{
			print(err)
		}
		defer res.Body.Close()
		io.Copy(out, strings.NewReader(resStr))

	}
	if err != nil{
		print(err)
	}
	duration := time.Since(start)
	print(duration)
}

