<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    var students =[
        {
            id: 1,
            name: 'ohzri',
            birth: '1999.09.09',
            city: '湖北',
            salary: 9379
        },
        {
            id: 2,
            name: 'rqgfd',
            birth: '1999.10.28',
            city: '湖北',
            salary: 1060
        },
        {
            id: 3,
            name: 'fwfsh',
            birth: '1999.09.17',
            city: '广西',
            salary: 9736
        },
        {
            id: 4,
            name: 'bqibt',
            birth: '1999.04.20',
            city: '湖南',
            salary: 9471
        },
        {
            id: 5,
            name: 'ypklq',
            birth: '1999.06.28',
            city: '山东',
            salary: 3123
        },
        {
            id: 6,
            name: 'lupnr',
            birth: '2001.10.03',
            city: '河南',
            salary: 4630
        },
        {
            id: 7,
            name: 'jvunu',
            birth: '1999.02.11',
            city: '广西',
            salary: 4196
        },
        {
            id: 8,
            name: 'edurz',
            birth: '2000.05.15',
            city: '山东',
            salary: 7223
        },
        {
            id: 9,
            name: 'yfyot',
            birth: '2000.11.10',
            city: '河南',
            salary: 2834
        },
        {
            id: 10,
            name: 'ormlt',
            birth: '1998.04.08',
            city: '湖北',
            salary: 7238
        },
        {
            id: 11,
            name: 'qpwvf',
            birth: '2001.10.26',
            city: '江西',
            salary: 7828
        },
        {
            id: 12,
            name: 'agqty',
            birth: '2000.03.24',
            city: '湖南',
            salary: 7503
        },
        {
            id: 13,
            name: 'zuohz',
            birth: '2001.06.03',
            city: '广西',
            salary: 2586
        },
        {
            id: 14,
            name: 'ezboq',
            birth: '1998.05.23',
            city: '广东',
            salary: 2944
        },
        {
            id: 15,
            name: 'puuak',
            birth: '1998.06.06',
            city: '湖南',
            salary: 7690
        },
        {
            id: 16,
            name: 'rlcjt',
            birth: '1999.06.07',
            city: '河南',
            salary: 9859
        },
        {
            id: 17,
            name: 'dmnqo',
            birth: '2001.11.12',
            city: '江西',
            salary: 0
        },
        {
            id: 18,
            name: 'jelza',
            birth: '1998.02.15',
            city: '山东',
            salary: 6401
        },
        {
            id: 19,
            name: 'urlhg',
            birth: '2001.01.20',
            city: '湖北',
            salary: 8775
        },
        {
            id: 20,
            name: 'cmiil',
            birth: '2000.07.20',
            city: '山东',
            salary: 7449
        },
        {
            id: 21,
            name: 'ikinr',
            birth: '2000.11.27',
            city: '广东',
            salary: 7223
        },
        {
            id: 22,
            name: 'oxhsf',
            birth: '2000.10.05',
            city: '广西',
            salary: 386
        },
        {
            id: 23,
            name: 'yahdc',
            birth: '1998.10.20',
            city: '广东',
            salary: 6545
        },
        {
            id: 24,
            name: 'dmghe',
            birth: '1999.04.11',
            city: '湖南',
            salary: 1372
        },
        {
            id: 25,
            name: 'llejo',
            birth: '1999.09.27',
            city: '山东',
            salary: 9728
        },
        {
            id: 26,
            name: 'verdk',
            birth: '1999.09.15',
            city: '河南',
            salary: 940
        },
        {
            id: 27,
            name: 'rjacz',
            birth: '2000.06.05',
            city: '湖南',
            salary: 3129
        },
        {
            id: 28,
            name: 'ruihr',
            birth: '2000.06.04',
            city: '山东',
            salary: 5864
        },
        {
            id: 29,
            name: 'untvw',
            birth: '2001.09.19',
            city: '河南',
            salary: 4394
        },
        {
            id: 30,
            name: 'xrehz',
            birth: '2000.09.14',
            city: '湖北',
            salary: 4908
        },
        {
            id: 31,
            name: 'ihojo',
            birth: '1998.03.17',
            city: '湖南',
            salary: 3689
        },
        {
            id: 32,
            name: 'pqtpa',
            birth: '2001.01.08',
            city: '山东',
            salary: 3404
        },
        {
            id: 33,
            name: 'yhyxs',
            birth: '2000.02.28',
            city: '广东',
            salary: 4644
        },
        {
            id: 34,
            name: 'osxwe',
            birth: '2007.09.03',
            city: '湖北',
            salary: 3146
        },
        {
            id: 35,
            name: 'mikqn',
            birth: '1998.02.14',
            city: '江西',
            salary: 9183
        },
        {
            id: 36,
            name: 'pilkm',
            birth: '1998.04.22',
            city: '山东',
            salary: 9196
        },
        {
            id: 37,
            name: 'flgmb',
            birth: '1998.06.04',
            city: '山东',
            salary: 3379
        },
        {
            id: 38,
            name: 'melep',
            birth: '2010.02.27',
            city: '湖南',
            salary: 3886
        }
    ];

    var stus = [];


    for (var i = 0; i <students.length ; i++) {
        if (students[i].salary>=3000 && students[i].salary<=3500){



            // console.log(students[i]);
            // stus.push(students[i]);
            // const student = {
            //     id:'',
            //     name:'',
            //     birth:'',
            //     city:'',
            //     salary:'',
            //     age:''
            // }

            const string = (students[i].birth.split("."))[0];
            // student.id=students[i].id;
            // student.name=students[i].name;
            // student.birth=students[i].birth;
            // student.salary=students[i].salary;
            students[i].age=new Date().getFullYear()-string;
            // stus.push(students[i]);
            // 计算满足条件的年龄总和
        }

    }
    console.log(stus);
    // function age(bir){
    //
    // }

</script>

<%--<c:forEach items ="students" var="stu">--%>
<%--<div>${students.[0].name}</div>--%>
<%--</c:forEach>--%>

</body>
</html>
