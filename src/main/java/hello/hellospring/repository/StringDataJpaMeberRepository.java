package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StringDataJpaMeberRepository extends JpaRepository<Member, Long>, MemberRepository{

    // select m from Member where m.name= ?
    @Override
    Optional<Member> findByName(String name);

    Optional<Member> findByNameAndId(String name, Long id);
}
