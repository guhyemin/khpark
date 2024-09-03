package com.bitstudy.app.dao;

import com.bitstudy.app.domain.AdateDto;
import com.bitstudy.app.domain.ArticleDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Time;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ArticleDaoTest {
    @Autowired
    ArticleDao articleDao;

    @Test
    public void insertArticle() {


        String[] title = {"시카고","하데스타운","영웅","어쩌면 해피엔딩","경종수정실록","카르밀라","리지","접변","스파이","등등곡","박열","빨래","유진과 유진","선천적 얼간이들","시데레우스","에밀","룰렛","홍련","비밀의 화원","베어 더 뮤지컬","god 2024 CONCERT","ONE UNIVERSE FESTIVAL 2024","THE VOLUNTEERS ASIA TOUR 2024","2024 STAYC FANMEETING","최하람 콘서트","메가 디제이 페스티벌","LOVE CHIPS FESTIVAL 2024","김윤아 살롱 콘서트","샘 헨쇼 내한공연","2024 아트 포레스트 페스티벌","CHERRY WORLD","2024 유채훈 단독 콘서트","2024 박재범 팬미팅","SHISHAMO 라이브 하우스 투어 2024","2024 수아레콘서트","2024 LEE GIKWANG SOLO CONCERT","뮤지컬 갈라콘서트 〈영웅들의 하모니〉","박은빈 OFFICIAL FANCLUB","2024 장기용 아시아 팬미팅","소란 여름 콘서트 ‘Squeeze!’","2024 예술의전당 오페라","마리아 조앙 피레스 피아노 리사이틀","유니버설발레단 〈라 바야데르〉","레이 첸 바이올리니스트","2024 국립발레단","이자람 판소리 〈노인과 바다〉","정경화 ＆ 임동혁 듀오 리사이틀","더 시네마＆클래식 _ 영화음악 OST","세상에서 가장 아름다운 오페라 〈라 보엠〉","선우예권의 라흐마니노프 피아노","스미노 하야토 피아노 리사이틀","지브리 영화음악 콘서트 2024 안산","세르게이 바바얀 피아노 리사이틀","향악잡영오수(鄕樂雜詠五首)","2024 디즈니 인 콘서트","오페라 〈세빌리아의 이발사〉","유키 구라모토 콘서트","2024 국립발레단 〈돈키호테〉","차이코프스키를 위하여","피터 야블론스키의 ‘Polish Night’","유코 히구치 특별展 : 비밀의 숲","헬로키티 50주년 특별전","파리의 휴일","2024 제15회 광주비엔날레","아메리칸 팝아트 거장전","서양 미술 800년展","아그네스 마틴: 완벽의 순간들-In Dialog: 정상화","어둠속의대화(DIALOGUE IN THE DARK)","힙노시스: 롱 플레잉 스토리","반 고흐 인사이드: 러브, 빈센트","이토 준지 호러하우스","인간, A.I를 만나다","컨페션 투 디 어스","모네 인 서울","플레이모빌 맨션 : 6개의 방으로 놀러와!","프랑스현대사진","나무의 시간, 내촌목공소 남희조 허회태","구하우스미술관 관람권","강릉 처음처럼＆새로 브랜드 체험관","〈에르베 튈레展-색색깔깔 뮤지엄〉","피오와 함께 돌아온 연극","〈세상친구〉","연극 〈투셰〉","당연한 바깥","〈오백에삼십〉","〈죽여주는 이야기〉","〈수상한흥신소〉","［창작공감: 작가］은의 혀","〈스위치〉","〈 그날의, 타이밍 〉","〈이방인〉","〈한여름 밤의 토크쇼〉","〈세 여자, 세 남자〉","한뼘사이","전기 없는 마을","〈남사친 여사친〉","카사노바","핫식스","연극 너의 목소리가 들려","택시안에서","달 샤베트","매직 판타지아 - 도로시 리턴즈","플레이모빌 맨션 : 6개의 방으로 놀러와!","넌 특별하단다","정글북","난책이좋아요","우리가족","소년 이순신","우산도둑","산초와 돈키호테","엄마는 안 가르쳐 줘","종이아빠","초등학생을 위한 실험실콘서트2","브로콜리 숲속 놀이터","친구의 전설","금수회의록","방귀쟁이 며느리","핑크퐁과 아기상어의 무지개 구출 작전","사라진 한글을 찾아라!","수박수영장"};



        String[] img = {"시카고1.gif","하데스타운1.gif","영웅1.gif","어쩌면 해피엔딩1.gif","경종수정실록1.gif","카르밀라1.gif","리지1.gif","접변1.gif","스파이1.gif","등등곡1.gif","박열1.gif","빨래1.gif","유진과 유진1.gif","선천적 얼간이들1.gif","시데레우스1.gif","에밀1.gif","룰렛1.gif","홍련1.gif","비밀의 화원1.gif","베어 더 뮤지컬1.gif","god 2024 CONCERT1.gif","ONE UNIVERSE FESTIVAL 20241.gif","THE VOLUNTEERS ASIA TOUR 20241.gif","2024 STAYC FANMEETING1.gif","최하람 콘서트1.gif","메가 디제이 페스티벌1.gif","LOVE CHIPS FESTIVAL 20241.gif","김윤아 살롱 콘서트1.gif","샘 헨쇼 내한공연1.gif","2024 아트 포레스트 페스티벌1.gif","CHERRY WORLD1.gif","2024 유채훈 단독 콘서트1.gif","2024 박재범 팬미팅1.gif","SHISHAMO 라이브 하우스 투어 20241.gif","2024 수아레콘서트1.gif","2024 LEE GIKWANG SOLO CONCERT1.gif","뮤지컬 갈라콘서트 〈영웅들의 하모니〉1.gif","박은빈 OFFICIAL FANCLUB1.gif","2024 장기용 아시아 팬미팅1.gif","소란 여름 콘서트 ‘Squeeze!’1.gif","2024 예술의전당 오페라1.gif","마리아 조앙 피레스 피아노 리사이틀1.gif","유니버설발레단 〈라 바야데르〉1.gif","레이 첸 바이올리니스트1.gif","2024 국립발레단1.gif","이자람 판소리 〈노인과 바다〉1.gif","정경화 ＆ 임동혁 듀오 리사이틀1.gif","더 시네마＆클래식 _ 영화음악 OST1.gif","세상에서 가장 아름다운 오페라 〈라 보엠〉1.gif","선우예권의 라흐마니노프 피아노1.gif","스미노 하야토 피아노 리사이틀1.gif","지브리 영화음악 콘서트 2024 안산1.gif","세르게이 바바얀 피아노 리사이틀1.gif","향악잡영오수(鄕樂雜詠五首)1.gif","2024 디즈니 인 콘서트1.gif","오페라 〈세빌리아의 이발사〉1.gif","유키 구라모토 콘서트1.gif","2024 국립발레단 〈돈키호테〉1.gif","차이코프스키를 위하여1.gif","피터 야블론스키의 ‘Polish Night’1.gif","유코 히구치 특별展  비밀의 숲1.gif","헬로키티 50주년 특별전1.gif","파리의 휴일1.gif","2024 제15회 광주비엔날레1.gif","아메리칸 팝아트 거장전1.gif","서양 미술 800년展1.gif","아그네스 마틴 완벽의 순간들-In Dialog 정상화1.gif","어둠속의대화(DIALOGUE IN THE DARK)1.gif","힙노시스 롱 플레잉 스토리1.gif","반 고흐 인사이드 러브, 빈센트1.gif","이토 준지 호러하우스1.gif","인간, A.I를 만나다1.gif","컨페션 투 디 어스1.gif","모네 인 서울1.gif","플레이모빌 맨션  6개의 방으로 놀러와!1.gif","프랑스현대사진1.gif","나무의 시간, 내촌목공소 남희조 허회태1.gif","구하우스미술관 관람권1.gif","강릉 처음처럼＆새로 브랜드 체험관1.gif","〈에르베 튈레展-색색깔깔 뮤지엄〉1.gif","피오와 함께 돌아온 연극1.gif","〈세상친구〉1.gif","연극 〈투셰〉1.gif","당연한 바깥1.gif","〈오백에삼십〉1.gif","〈죽여주는 이야기〉1.gif","〈수상한흥신소〉1.gif","［창작공감 작가］은의 혀1.gif","〈스위치〉1.gif","〈 그날의, 타이밍 〉1.gif","〈이방인〉1.gif","〈한여름 밤의 토크쇼〉1.gif","〈세 여자, 세 남자〉1.gif","한뼘사이1.gif","전기 없는 마을1.gif","〈남사친 여사친〉1.gif","카사노바1.gif","핫식스1.gif","연극 너의 목소리가 들려1.gif","택시안에서1.gif","달 샤베트1.gif","매직 판타지아 - 도로시 리턴즈1.gif","플레이모빌 맨션  6개의 방으로 놀러와!1.gif","넌 특별하단다1.gif","정글북1.gif","난책이좋아요1.gif","우리가족1.gif","소년 이순신1.gif","우산도둑1.gif","산초와 돈키호테1.gif","엄마는 안 가르쳐 줘1.gif","종이아빠1.gif","초등학생을 위한 실험실콘서트21.gif","브로콜리 숲속 놀이터1.gif","친구의 전설1.gif","금수회의록1.gif","방귀쟁이 며느리1.gif","핑크퐁과 아기상어의 무지개 구출 작전1.gif","사라진 한글을 찾아라!1.gif","수박수영장1.gif"};

        String[] content = {"시카고2.jpg","하데스타운2.jpg","영웅2.jpg","어쩌면 해피엔딩2.jpg","경종수정실록2.jpg","카르밀라2.jpg","리지2.jpg","접변2.jpg","스파이2.jpg","등등곡2.jpg","박열2.jpg","빨래2.jpg","유진과 유진2.jpg","선천적 얼간이들2.jpg","시데레우스2.jpg","에밀2.jpg","룰렛2.jpg","홍련2.jpg","비밀의 화원2.jpg","베어 더 뮤지컬2.jpg","god 2024 CONCERT2.jpg","ONE UNIVERSE FESTIVAL 20242.jpg","THE VOLUNTEERS ASIA TOUR 20242.jpg","2024 STAYC FANMEETING2.jpg","최하람 콘서트2.jpg","메가 디제이 페스티벌2.jpg","LOVE CHIPS FESTIVAL 20242.jpg","김윤아 살롱 콘서트2.jpg","샘 헨쇼 내한공연2.jpg","2024 아트 포레스트 페스티벌2.jpg","CHERRY WORLD2.jpg","2024 유채훈 단독 콘서트2.jpg","2024 박재범 팬미팅2.jpg","SHISHAMO 라이브 하우스 투어 20242.jpg","2024 수아레콘서트2.jpg","2024 LEE GIKWANG SOLO CONCERT2.jpg","뮤지컬 갈라콘서트 〈영웅들의 하모니〉2.jpg","박은빈 OFFICIAL FANCLUB2.jpg","2024 장기용 아시아 팬미팅2.jpg","소란 여름 콘서트 ‘Squeeze!’2.jpg","2024 예술의전당 오페라2.jpg","마리아 조앙 피레스 피아노 리사이틀2.jpg","유니버설발레단 〈라 바야데르〉2.jpg","레이 첸 바이올리니스트2.jpg","2024 국립발레단2.jpg","이자람 판소리 〈노인과 바다〉2.jpg","정경화 ＆ 임동혁 듀오 리사이틀2.jpg","더 시네마＆클래식 _ 영화음악 OST2.jpg","세상에서 가장 아름다운 오페라 〈라 보엠〉2.jpg","선우예권의 라흐마니노프 피아노2.jpg","스미노 하야토 피아노 리사이틀2.jpg","지브리 영화음악 콘서트 2024 안산2.jpg","세르게이 바바얀 피아노 리사이틀2.jpg","향악잡영오수(鄕樂雜詠五首)2.jpg","2024 디즈니 인 콘서트2.jpg","오페라 〈세빌리아의 이발사〉2.jpg","유키 구라모토 콘서트2.jpg","2024 국립발레단 〈돈키호테〉2.jpg","차이코프스키를 위하여2.jpg","피터 야블론스키의 ‘Polish Night’2.jpg","유코 히구치 특별展  비밀의 숲2.jpg","헬로키티 50주년 특별전2.jpg","파리의 휴일2.jpg","2024 제15회 광주비엔날레2.jpg","아메리칸 팝아트 거장전2.jpg","서양 미술 800년展2.jpg","아그네스 마틴 완벽의 순간들-In Dialog 정상화2.jpg","어둠속의대화(DIALOGUE IN THE DARK)2.jpg","힙노시스 롱 플레잉 스토리2.jpg","반 고흐 인사이드 러브, 빈센트2.jpg","이토 준지 호러하우스2.jpg","인간, A.I를 만나다2.jpg","컨페션 투 디 어스2.jpg","모네 인 서울2.jpg","플레이모빌 맨션  6개의 방으로 놀러와!2.jpg","프랑스현대사진2.jpg","나무의 시간, 내촌목공소 남희조 허회태2.jpg","구하우스미술관 관람권2.jpg","강릉 처음처럼＆새로 브랜드 체험관2.jpg","〈에르베 튈레展-색색깔깔 뮤지엄〉2.jpg","피오와 함께 돌아온 연극2.jpg","〈세상친구〉2.jpg","연극 〈투셰〉2.jpg","당연한 바깥2.jpg","〈오백에삼십〉2.jpg","〈죽여주는 이야기〉2.jpg","〈수상한흥신소〉2.jpg","［창작공감 작가］은의 혀2.jpg","〈스위치〉2.jpg","〈 그날의, 타이밍 〉2.jpg","〈이방인〉2.jpg","〈한여름 밤의 토크쇼〉2.jpg","〈세 여자, 세 남자〉2.jpg","한뼘사이2.jpg","전기 없는 마을2.jpg","〈남사친 여사친〉2.jpg","카사노바2.jpg","핫식스2.jpg","연극 너의 목소리가 들려2.jpg","택시안에서2.jpg","달 샤베트2.jpg","매직 판타지아 - 도로시 리턴즈2.jpg","플레이모빌 맨션  6개의 방으로 놀러와!2.jpg","넌 특별하단다2.jpg","정글북2.jpg","난책이좋아요2.jpg","우리가족2.jpg","소년 이순신2.jpg","우산도둑2.jpg","산초와 돈키호테2.jpg","엄마는 안 가르쳐 줘2.jpg","종이아빠2.jpg","초등학생을 위한 실험실콘서트22.jpg","브로콜리 숲속 놀이터2.jpg","친구의 전설2.jpg","금수회의록2.jpg","방귀쟁이 며느리2.jpg","핑크퐁과 아기상어의 무지개 구출 작전2.jpg","사라진 한글을 찾아라!2.jpg","수박수영장2.jpg"};

        String[] location = {"디큐브 링크아트센터","샤롯데씨어터","세종문화회관 대극장","예스24스테이지","대학로 TOM","링크아트센터드림 드림1관","두산아트센터 연강홀","대학로 TOM","동국대학교 이해랑예술극장","대학로 TOM","링크아트센터드림 드림3관","인터파크 유니플렉스 2관","링크아트센터드림","KT＆G 상상마당 대치아트홀","플러스씨어터","예스24스테이지 3관","연남장","대학로 자유극장","국립정동극장","두산아트센터"};
        String[] time = {"145","155","165","110","110","100","120","100","120","100","100","165","100","110","100","100","90","90","100","165"};
        int[] keyword = {1,2,3,4};
        int[] cate = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6};


        for (int i=0; i<120; i++){
            Date date = new Date(2024-1900,05,12+i);
            Date date2 = new Date(2024-1900,05,18+i);
            ArticleDto articleDto = new ArticleDto(img[i],title[i],content[i],location[i%20],0,keyword[i%4],cate[i],date,date2, time[i%20]);
            articleDao.insertArticle(articleDto);
        }
    }
//    @Test
//    public void insertArticle() {
//        Date date = new Date(2024-1900,3,8);
//        Date date2 = new Date(2024-1900,6,18);
//        ArticleDto articleDto = new ArticleDto("img","제목","내용","주소",10000,1,1,date,date2);
//        articleDao.insertArticle(articleDto);
//    }

    @Test
    public void updateArticle() {
        Map map = new HashMap();
        map.put("a_order_count",1);
        map.put("a_seqno",1);

        articleDao.updateArticle(map);
    }

    @Test
    public void selectOrderCount() {
        Integer aaa = articleDao.selectOrderCount(1);
        System.out.println("여기예요"+aaa);
    }

    @Test
    public void selectArticle() {
        ArticleDto aaa = articleDao.selectArticle(1);
        System.out.println("여기여기"+aaa);
    }

    @Test
    public void selectCateRanking() {
        List<ArticleDto> aaa = articleDao.selectCateRanking(3);
        System.out.println("여기라구"+aaa);
    }

    @Test
    public void selectNew() {
        List<ArticleDto> aaa = articleDao.selectNew();
        System.out.println("여기라구"+aaa);
    }

    @Test
    public void selectSearch() {
        Map map = new HashMap<>();
        map.put("offset",10);
        map.put("keyword","제목");
        map.put("option","a_e_date");

        List<ArticleDto> aaa = articleDao.selectSearch(map);
        System.out.println("여기라구"+aaa);
    }

    @Test
    public void deleteArticle() {
        articleDao.deleteArticle(1);
    }
}
