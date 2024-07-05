package com.ys.nineblockers.data

fun getMenus(): List<String> {
    return listOf(
        "리그 시상",
        "MVP",
    )
}

fun getLeagueRecords(): List<String> {
    return listOf(
        "3위 B팀!\n9승 21패",
        "2위 C팀!\n18승 12패",
        "1위 A팀!\n18승 12패",
    )
}

fun getMvpRecords(): List<String> {
    return listOf(
        "후보 1번 - 김돈규\n출석:14회\n누적득점:321점\n리바:226개\n어시:48개\n스틸:32개\n블록:25개",
        "후보 2번 - 남궁현\n출석:12회\n누적득점:263점\n리바:146개\n어시:48개\n스틸:43개\n블록:8개",
        "후보 3번 - 유지형\n출석:12회\n누적득점:513점\n리바:52개\n어시:64개\n스틸:12개\n블록:0개",
    )
}