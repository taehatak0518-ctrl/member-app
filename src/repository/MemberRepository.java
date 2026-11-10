package repository;

import entity.Member;

// 모든 CRUD 구현의 뼈대를 갖는 클래스
public interface MemberRepository {
    // 저장
    // 내가 메버를 줄테니 저장은 너가 알아서 하고
    // 결과(true/false)
    boolean save(Member member);
    // 전체 읽어오는것
    // 특정 아이디를 찾는 기능
    // 수정
    // 삭제
}
