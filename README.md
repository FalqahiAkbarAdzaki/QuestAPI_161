## Screenshot Operasi

### 1) POST
<img width="381" height="844" alt="image" src="https://github.com/user-attachments/assets/1656c092-e703-46e3-bc23-31dc04ab04bd" />

### 2) GET
<img width="384" height="844" alt="image" src="https://github.com/user-attachments/assets/ddd75cdf-2cca-4973-b441-073a0e4cb918" />

### 3) GET by id
<img width="384" height="808" alt="image" src="https://github.com/user-attachments/assets/f83a5695-99b6-45be-943a-2a039aa3f32a" />

### 4) PUT / UPDATE
<img width="377" height="804" alt="image" src="https://github.com/user-attachments/assets/808a8979-3e8f-42a9-8cc3-7e5ff1ffb2cc" />

### 5) DELETE
<img width="390" height="811" alt="image" src="https://github.com/user-attachments/assets/0e735674-7ca8-4f76-9b2d-c85f63e8d1ad" />


##

<details>
  <summary>Lihat Database dan Request-Response</summary>
  
### 6) Database
<img width="761" height="466" alt="image" src="https://github.com/user-attachments/assets/da6623a7-00e6-4671-8846-0b2cb9029e67" />

### 7) Request-Response
###### Tools: Thunder Client (VS Code-Extension)
#### POST
`http://localhost/umyTI/insertTM.php`
##### Body
```
{
  "nama": "Budi Santoso",
  "alamat": "Yogyakarta",
  "telpon": "08123456789"
}
```
<img width="1486" height="902" alt="image" src="https://github.com/user-attachments/assets/972d7b7a-831d-49e4-b1c5-e9f044f1414b" />

#### GET 
`http://localhost/umyTI/bacateman.php`
<img width="1483" height="901" alt="image" src="https://github.com/user-attachments/assets/68bf0e8b-6d36-4852-a935-cddcda79cbb4" />

#### GET by id query params
`http://localhost/umyTI/baca1teman.php?id=3`
<img width="1483" height="904" alt="image" src="https://github.com/user-attachments/assets/ee019f17-5c09-4c14-8a0b-3efb6371456c" />

#### PUT
`http://localhost/umyTI/editTM.php?id=3`
##### Body
```
{
  "nama": "Naufal",
  "alamat": "Sleman",
  "telpon": "08987654321"
}
```
<img width="1485" height="901" alt="image" src="https://github.com/user-attachments/assets/8948ce82-ddf9-49d0-962a-a303fb13db50" />

#### DELETE
`http://localhost/umyTI/deleteTM.php?id=3`
<img width="1484" height="900" alt="image" src="https://github.com/user-attachments/assets/3bdab1de-80d5-4da0-9cd8-bef5bb6a1039" />

