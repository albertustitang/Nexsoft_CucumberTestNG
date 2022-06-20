#Author: albertustitang@gmail.com

Feature: Login to Cicool Dashboard

	Scenario: Login dengan menggunakan valid credential

		Given User berada di halaman Login Account
		When User memasukkan username
		And User memasukkan password
		And User menekan tombol login
		Then User dapat masuk ke dalam Dashboard

	Scenario: Login dengan menggunakan credential tidak valid
		
		Given User berada di halaman Login Account
		When User memasukkan username
		And User memasukkan password salah
		And User menekan tombol login
		Then User tidak dapat masuk ke dalam Dashboard
		

